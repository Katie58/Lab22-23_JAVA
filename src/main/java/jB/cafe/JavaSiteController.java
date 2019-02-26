package jB.cafe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jB.cafe.dao.ItemsDAO;
import jB.cafe.entity.Item;

@Controller
public class JavaSiteController {
	
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
	
	@RequestMapping("/javaBeanShop/item/{id}/")
	public ModelAndView detail(@PathVariable("id") Long id) {
		Item item = itemsDao.findById(id);
		return new ModelAndView("item-details", "item", item);
	}

}

