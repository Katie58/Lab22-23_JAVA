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
import jB.cafe.dao.CartDAO;
import jB.cafe.dao.ItemsDAO;
import jB.cafe.entity.CartItem;

@Controller
@SessionAttributes("cart")
public class CartController {
	
	@Autowired
	private CartDAO cartDao;
	
	@Autowired
	private ItemsDAO itemsDao;
	
	@RequestMapping("/javaBeanShop/cart")
	public ModelAndView viewCart() {
		ModelAndView mav = new ModelAndView("cart");
		List<CartItem> cart = cartDao.findAll();
		List<Item> item = itemsDao.findAll();
		
		mav.addObject("cart", cart);
		mav.addObject("item", item);
		
		return mav;
	}
	
	@PostMapping("/javaBeanShop/cart")
	public ModelAndView editCart(CartItem shoppingCart, HttpSession session) {
		session.setAttribute("cart", shoppingCart);
		return new ModelAndView("redirect:/javaBeanShop/cart");
	}
	
	@RequestMapping("/javaBeanShop/cart/{id}/add")
	public ModelAndView addToCart(@PathVariable("id") Long id) {
		Item item = itemsDao.findById(id);
		CartItem cartItem = new CartItem();
		cartItem.setItem(item);
		
		cartDao.create(cartItem);
		return new ModelAndView("redirect:/javaBeanShop/cart");
	}
	
	@RequestMapping("/javaBeanShop/cart/{id}/delete")
	public ModelAndView deleteFromCart(@PathVariable("id") Long id) {
		CartItem cartItem = new CartItem();
		cartItem.setId(id);
		cartDao.delete(cartItem);
		return new ModelAndView("redirect:/javaBeanShop/cart");
	}

}

