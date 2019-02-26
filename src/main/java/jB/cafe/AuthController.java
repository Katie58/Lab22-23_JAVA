package jB.cafe;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jB.cafe.dao.UsersDAO;
import jB.cafe.entity.User;

@Controller
public class AuthController {

	@Autowired
	UsersDAO usersDao;
	@Autowired
	jB.cafe.github.GithubService githubService;

	@RequestMapping("/login")
	public ModelAndView showLoginForm() {
		return new ModelAndView("login");
	}

	@PostMapping("/login")
	public ModelAndView submitLoginForm(
			@RequestParam("username") String username,
			@RequestParam("password") String password,
			HttpSession session, RedirectAttributes redir) {
		
		User user = usersDao.findByName(username);
		if (user == null || !user.getPassword().equals(password)) {
			return new ModelAndView("login", "message", "Incorrect username or password.");
		}
		
		session.setAttribute("user", user);
		
		redir.addFlashAttribute("message", "Welcome. Thanks for logging in.");
		return new ModelAndView("redirect:/");
	}

	@RequestMapping("/logout")
	public ModelAndView logout(HttpSession session, RedirectAttributes redir) {
		session.invalidate();
		redir.addFlashAttribute("Logged out.");
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping("/signup")
	public ModelAndView showSignupForm() {
		return new ModelAndView("signup");
	}

	@PostMapping("/signup")
	public ModelAndView submitSignupForm(
			User user,
			@RequestParam("confirm-password") String confirmPassword, 
			HttpSession session, RedirectAttributes redir) {
		User existingUser = usersDao.findByName(user.getFirstname());
		if (existingUser != null) {
			return new ModelAndView("signup", "message", "A user with that username already exists.");
		}
		
		if (!confirmPassword.equals(user.getPassword())) {
			return new ModelAndView("signup", "message", "Passwords do not match.");
		}
		
		usersDao.create(user);
		
		session.setAttribute("user", user);
		
		redir.addFlashAttribute("message", "Thanks for signing up!");
		return new ModelAndView("redirect:/");
	}

	@RequestMapping("/oauth-github-callback")
	public ModelAndView handleGithubCallback(@RequestParam("code") String code, HttpSession session) {
		String accessToken = githubService.getGithubAccessToken(code);
		User githubUser = githubService.getUserFromGithubApi(accessToken);

		User user = usersDao.findByGithubId(githubUser.getGithubId());
		if (user == null) {
			user = githubUser;
			usersDao.create(user);
		}

		session.setAttribute("user", user);
		session.setAttribute("githubAccessToken", accessToken);

		return new ModelAndView("redirect:/");
	}

	

}
