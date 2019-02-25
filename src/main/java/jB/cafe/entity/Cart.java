package jB.cafe.entity;

import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private HashMap<Item, Integer> cart;
	
	public Cart() {
		this.cart = new HashMap<Item, Integer>();
	}
	
	public Cart(HashMap<Item, Integer> cart) {
		this.cart = cart;
	}
	
	public Cart(Item item, Integer quantity) {
		this.cart = new HashMap<Item, Integer>();
		cart.put(item, quantity);
	}
	
	public void setCart(HashMap<Item, Integer> cart) {
		this.cart = cart;
	}
	
	public void setCart(Item item) {
		cart.put(item, 1);
	}
	
	public void setCart(Item item, int quantity) {
		cart.put(item, quantity);
	}
	
	public HashMap<Item, Integer> getCart() {
		return cart;
	}
	
	public void addToCart(Item item) {
		if (cart.isEmpty()) {
			cart.put(item, 1);
		} else if (cart.containsKey(item)) {
			int val = cart.get(item);
			cart.replace(item, val + 1);
		} else {
			cart.put(item, 1);
		}
	}
	
	public void addToCart(Item item, int quantity) {
		if (cart.isEmpty()) {
			cart.put(item, quantity);
		} else if (cart.containsKey(item)) {
			int val = cart.get(item);
			cart.replace(item, val + quantity);
		} else {
			cart.put(item, quantity);
		}
	}
	
	public void removeFromCart(Item item) {
		cart.remove(item);
	}
	
	public void updateCart(Item item, int quantity) {
		if (quantity == 0) {
			removeFromCart(item);
			return;
		} else {
			cart.replace(item, quantity);
		}
	}

}
