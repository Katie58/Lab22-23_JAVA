package Lab22and23.javaSite;

public class User {

	private Long id;
	private String firstname;
	private String lastname;
	private String email;
	private int age;
	private String password;
	private boolean newsletter;
	
	public User() {}
	
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
	
	public boolean getNewsletter() {
		return newsletter;
	}
	
	@Override
	public String toString() {
		return firstname + ":" + lastname + ":" + email + ":" + age + ":" + password;
	}
	
}

