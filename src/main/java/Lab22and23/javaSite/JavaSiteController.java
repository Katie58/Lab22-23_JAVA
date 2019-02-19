package Lab22and23.javaSite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JavaSiteController {

	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");	
	}
	
	@RequestMapping("/register-user") 
	public ModelAndView registerUser() {
		return new ModelAndView("user-form");
	}
	
	@RequestMapping("/user-confirmation")
	public ModelAndView confirmUser(User user) {
		return new ModelAndView("user-confirmation");
	}
}
