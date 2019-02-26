package jB.cafe.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class Item {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private int stock;
	private Double price;

	public Item() {}
	
	public Item(String name, String description, int quantity, Double price) {
		this.name = name;
		this.description = description;
		this.stock = quantity;
		this.price = price;
	}
	
	public Item(Long id, String name, String description, int quantity, Double price) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.stock = quantity;
		this.price = price;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setQuantity(int quantity) {
		this.stock = quantity;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getQuantity() {
		return stock;
	}
	
	public double getPrice() {
		return price;
	}
	
}
