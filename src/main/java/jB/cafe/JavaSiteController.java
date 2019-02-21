package jB.cafe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jB.cafe.dao.ItemsDAO;
import jB.cafe.dao.UsersDAO;
import jB.cafe.entity.Item;
import jB.cafe.entity.User;

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
	
	@RequestMapping("/javaBeanShop/{id}/")
	public ModelAndView detail(@PathVariable("id") Long id) {
		Item item = itemsDao.findById(id);
		return new ModelAndView("item-details", "item", item);
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
	
	@RequestMapping("/admin")
	public ModelAndView admin() {
		return new ModelAndView("admin");
	}
	
	@RequestMapping("/admin/items")
	public ModelAndView adminItems() {
		List<Item> leListOfItems = itemsDao.findAll();
		return new ModelAndView("admin-items", "items", leListOfItems);
	}
		
	@RequestMapping("/admin/item{id}/")
	public ModelAndView adminItemDetail(@PathVariable("id") Long id) {
		Item item = itemsDao.findById(id);
		
		return new ModelAndView("admin-itemdetails", "item", item);
	}
	
	@RequestMapping("/admin/item{id}/edit")
	public ModelAndView adminItemEdit(@PathVariable("id") Long id) {
		Item item = itemsDao.findById(id);
		
		return new ModelAndView("admin-itemedit", "item", item);
	}
	
	@PostMapping("/admin/item{id}/edit")
	public ModelAndView adminItemSave(@PathVariable("id") Long id, Item item) {
		item.setId(id);
		
		itemsDao.update(item);
		
		return new ModelAndView("redirect:/admin/" + id);
	}
		
	@RequestMapping("/admin/item{id}/delete")
	public ModelAndView adminItemRemove(@PathVariable("id") Long id) {
		itemsDao.delete(id);
		
		return new ModelAndView("redirect:/admin/items");
	}
	
	@RequestMapping("/admin/item/add")
	public ModelAndView adminItemadd() {		
		return new ModelAndView("admin-itemadd");
	}
	
	@PostMapping("/admin/item/add")
	public ModelAndView adminItemAddSubmit(Item item) {		
		itemsDao.create(item);
		
		return new ModelAndView("redirect:/admin/items");
	}
	
	@RequestMapping("/admin/users")
	public ModelAndView adminUsers() {
		List<User> leListOfUsers = usersDao.findAll();
		return new ModelAndView("admin-users", "users", leListOfUsers);
	}
	
	@RequestMapping("/admin/user{id}/")
	public ModelAndView adminUserDetail(@PathVariable("id") Long id) {
		User user = usersDao.findById(id);
		
		return new ModelAndView("admin-userdetails", "user", user);
	}
	
	@RequestMapping("/admin/user{id}/edit")
	public ModelAndView adminUserEdit(@PathVariable("id") Long id) {
		User user = usersDao.findById(id);
		
		return new ModelAndView("admin-useredit", "user", user);
	}
	
	@PostMapping("/admin/user{id}/edit")
	public ModelAndView adminUserSave(@PathVariable("id") Long id, User user) {
		user.setId(id);
		
		usersDao.update(user);
		
		return new ModelAndView("redirect:/admin/" + id);
	}
	
	@RequestMapping("/admin/user{id}/delete")
	public ModelAndView adminUserRemove(@PathVariable("id") Long id) {
		usersDao.delete(id);
		
		return new ModelAndView("redirect:/admin/users");
	}
	
	@RequestMapping("/admin/user/add")
	public ModelAndView adminUserAdd() {		
		return new ModelAndView("admin-useradd");
	}
	
	@PostMapping("/admin/user/add")
	public ModelAndView adminUserAddSubmit(User user) {		
		usersDao.create(user);
		
		return new ModelAndView("redirect:/admin/users");
	}
}

