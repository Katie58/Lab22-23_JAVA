package jB.cafe;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import jB.cafe.entity.User;

@Controller
public class UserController {
	
	// Use @SessionAttribute to get item from session
	@RequestMapping("/edit-profile")
	public ModelAndView showEditProfile(@SessionAttribute(name="profile", required=false) User user) {
		return new ModelAndView("edit-profile", "user", user);
	}
	
	// Use HttpSession to set an attribute on the session
	@PostMapping("/edit-profile")
	public ModelAndView submitEditProfile(User user, HttpSession session) {
		session.setAttribute("profile", user);
		ModelAndView mav = new ModelAndView("redirect:/");
		return mav;
	}
}