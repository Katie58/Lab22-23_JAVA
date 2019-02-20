package javaBean.javaSite.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javaBean.javaSite.entity.Item;

@Repository
public class ItemsDAO {
	
	@Autowired
	private JdbcTemplate jdbc;

	public List<Item> findAll() {
		String sql = "SELECT * FROM items";
		return jdbc.query(sql, new BeanPropertyRowMapper<>(Item.class));
	}
	
	public Item findById(Long id) {
		String sql = "SELECT * FROM items WHERE id = ?";
		return jdbc.queryForObject(sql, new BeanPropertyRowMapper<>(Item.class), id);
	}
	
	public void update(Item item) {
		String sql = "UPDATE items SET name=?, description=?, quantity=?, price=? WHERE id = ?";
		jdbc.update(sql, item.getName(), item.getDescription(), item.getQuantity(), item.getPrice(), item.getId());
	}
	
	public void create(Item item) {
		String sql = "INSERT INTO items (name, description, quantity, price) VALUES (?, ?, ?, ?)";
		jdbc.update(sql, item.getName(), item.getDescription(), item.getQuantity(), item.getPrice());
	}
	
	public void delete(Long id) {
		String sql = "DELETE FROM items WHERE id = ?";
		jdbc.update(sql, id);
	}
}

