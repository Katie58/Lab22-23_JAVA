package jB.cafe.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String firstname;
	private String lastname;
	private String name;
	private String username;
	private String email;
	private int age;
	private String password;
	private Long githubId;
	private boolean newsletter;
	
	public User() {}
	
	public User(String name, String username, String password) {
		this.name = name;
		this.username = username;
		this.password = password;
	}
	
	public User(Long id, String firstname, String lastname, String email, int age, String password, boolean newsletter) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.age = age;
		this.password = password;
		this.newsletter = newsletter;
	}
	
	public User(String firstname, String lastname, String email, int age, String password) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.age = age;
		this.password = password;
	}
	
	public User(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setNewsletter(boolean newsletter) {
		this.newsletter = newsletter;
	}
	
	public String getName() {
		return name;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getPassword() {
		return password;
	}
	
	public Long getGithubId() {
		return githubId;
	}

	public void setGithubId(Long githubId) {
		this.githubId = githubId;
		if (firstname == null) {
			firstname = "John";
		}
		if (lastname == null) {
			lastname = "Doe";
		}
	}
	
	public boolean getNewsletter() {
		return newsletter;
	}
	
	@Override
	public String toString() {
		return firstname + ":" + lastname + ":" + email + ":" + age + ":" + password;
	}
	
}

