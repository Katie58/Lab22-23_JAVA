package jB.cafe;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import jB.cafe.dao.UsersDAO;
import jB.cafe.entity.User;

@Controller
public class UserController {
	
	@Autowired
	private UsersDAO usersDao;
	
	@RequestMapping("/register-user") 
	public ModelAndView registerUser() {
		return new ModelAndView("user-form");
	}
	
	@RequestMapping("/user-confirmation")
	public ModelAndView confirmUser(User user) {
		usersDao.create(user);
		
		return new ModelAndView("user-confirmation");
	}
	
	@RequestMapping("/edit-profile")
	public ModelAndView showEditProfile(@SessionAttribute(name="profile", required=false) User user) {
		return new ModelAndView("edit-profile", "user", user);
	}
	
	@PostMapping("/edit-profile")
	public ModelAndView submitEditProfile(User user, HttpSession session) {
		session.setAttribute("profile", user);
		ModelAndView mav = new ModelAndView("redirect:/");
		return mav;
	}
}