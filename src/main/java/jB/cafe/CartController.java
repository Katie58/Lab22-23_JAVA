package jB.cafe;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import jB.cafe.entity.Item;
import jB.cafe.dao.ItemsDAO;
import jB.cafe.entity.Cart;

@Controller
@SessionAttributes("cart")
public class CartController {
	
	private Cart shoppingCart = new Cart();
	
	@Autowired
	private ItemsDAO itemsDao;
	
	@RequestMapping("/javaBeanShop/cart")
	public ModelAndView viewCart() {
		HashMap<Item, Integer> items = shoppingCart.getCart();
		return new ModelAndView("cart", "cart", items);
	}
	
	@PostMapping("/javaBeanShop/cart")
	public ModelAndView editCart(Cart shoppingCart, HttpSession session) {
		session.setAttribute("cart", shoppingCart);
		return new ModelAndView("redirect:/javaBeanShop/cart");
	}
	
	@RequestMapping("/javaBeanShop/cart/{id}/add")
	public ModelAndView addToCart(@PathVariable("id") Long id, HttpSession session) {
		Item item = itemsDao.findById(id);
		shoppingCart.addToCart(item);
		session.setAttribute("cart", shoppingCart);
		return new ModelAndView("redirect:/javaBeanShop/cart");
	}
	
//	@RequestMapping("/javaBeanShop/cart/{id}/")
//	public ModelAndView detail(@PathVariable("id") Long id) {
//		Item item = itemsDao.findById(id);
//		return new ModelAndView("item-details", "item", item);
//	}

}

