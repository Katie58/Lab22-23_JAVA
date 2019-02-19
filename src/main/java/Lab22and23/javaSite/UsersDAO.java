package Lab22and23.javaSite;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Lab22and23.javaSite.User;

@Repository
public class UsersDAO {
	
	@Autowired
	private JdbcTemplate jdbc;

	public List<User> findAll() {
		String sql = "SELECT * FROM users";
		return jdbc.query(sql, new BeanPropertyRowMapper<>(User.class));
	}
	
	public User findById(Long id) {
		String sql = "SELECT * FROM users WHERE id = ?";
		return jdbc.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), id);
	}
	
	public void update(User user) {
		String sql = "UPDATE users SET firstname=?, lastname=?, email=?, age=?, password=?, newsletter=? WHERE id = ?";
		jdbc.update(sql, user.getFirstname(), user.getLastname(), user.getEmail(), user.getAge(), user.getPassword(), user.getNewsletter(), user.getId());
	}
	
	public void create(User user) {
		String sql = "INSERT INTO users (firstname, lastname, email, age, password, newsletter) VALUES (?, ?, ?, ?, ?, ?)";
		jdbc.update(sql, user.getFirstname(), user.getLastname(), user.getEmail(), user.getAge(), user.getPassword(), user.getNewsletter());
	}
	
	public void delete(Long id) {
		String sql = "DELETE FROM users WHERE id = ?";
		jdbc.update(sql, id);
	}
}

