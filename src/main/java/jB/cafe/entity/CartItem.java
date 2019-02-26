package jB.cafe.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class CartItem {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private int quantity;
	@ManyToOne
	private Item item;
	@ManyToOne
	private User user;
	
	public CartItem() {
	}
	
	public CartItem(Item item) {
		this.item = item;
		this.quantity = 1;
	}
	
	public CartItem(Item item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}
	
	public CartItem(Long id, Item item) {
		this.id = id;
		this.item = item;
	}
	
	public CartItem(Long id, int quantity, Item item) {
		this.id = id;
		this.quantity = quantity;
		this.item = item;
	}
	
	public CartItem(Long id, int quantity, Item item, User user) {
		this.id = id;
		this.quantity = quantity;
		this.item = item;
		this.user = user;
	}
	
	public void setItem(Item item) {
		this.item = item;
		this.quantity = 1;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public Long getId() {
		return id;
	}
	
	public Item getItem() {
		return item;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public User getUser() {
		return user;
	}

}
