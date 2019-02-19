package Lab22and23.javaSite;

public class User {

	private String firstname;
	private String lastname;
	private String email;
	private int age;
	private String password;
	private String car;
	
	public User() {}
	
	public User(String firstname, String lastname, String email, int age, String password) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.age = age;
		this.password = password;
	}
	
	public void setCar(String car) {
		this.car = car;
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
	
	@Override
	public String toString() {
		return firstname + ":" + lastname + ":" + email + ":" + age + ":" + password;
	}
	
}

