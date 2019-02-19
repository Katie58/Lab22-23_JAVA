package Lab22and23.javaSite;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Lab22and23.javaSite.UsersDAO;
import Lab22and23.javaSite.ItemsDAO;

@Controller
public class JavaSiteController {
	
	@Autowired
	private UsersDAO usersDao;
	
	@Autowired
	private ItemsDAO itemsDao;

	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");	
	}
	
	@RequestMapping("/javaBeanShop")
	public ModelAndView shop() {
		List<Item> leListOfItems = itemsDao.findAll();
		return new ModelAndView("shop", "items", leListOfItems);
	}
	
	@RequestMapping("/javaBeanShop/{id}")
	public ModelAndView detail(@PathVariable("id") Long id) {
		Item item = itemsDao.findById(id);
		
		return new ModelAndView("item-details", "item", item);
	}
	
	@RequestMapping("/javaBeanShop/{id}/edit")
	public ModelAndView edit(@PathVariable("id") Long id) {
		Item item = itemsDao.findById(id);
		
		return new ModelAndView("item-edit", "item", item);
	}
	
	@PostMapping("/javaBeanShop/{id}/edit")
	public ModelAndView save(@PathVariable("id") Long id, Item item) {
		item.setId(id);
		
		itemsDao.update(item);
		
		return new ModelAndView("redirect:/javaBeanShop/" + id);
	}
	
	@RequestMapping("/javaBeanShop/add")
	public ModelAndView add() {		
		return new ModelAndView("item-add");
	}
	
	@PostMapping("/javaBeanShop/add")
	public ModelAndView addSubmit(Item item) {		
		itemsDao.create(item);
		
		return new ModelAndView("redirect:/javaBeanShop");
	}
	
	@RequestMapping("/javaBeanShop/{id}/delete")
	public ModelAndView remove(@PathVariable("id") Long id) {
		itemsDao.delete(id);
		
		return new ModelAndView("redirect:/javaBeanShop");
	}
	
	@RequestMapping("/register-user") 
	public ModelAndView registerUser() {
		return new ModelAndView("user-form");
	}
	
	@RequestMapping("/user-confirmation")
	public ModelAndView confirmUser(User user) {
		usersDao.create(user);
		
		return new ModelAndView("user-confirmation");
	}
}
