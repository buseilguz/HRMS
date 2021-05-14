package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")

public class User {
	@Id
	@Column(name="id")
	@GeneratedValue
	private int id;
	
	@Column(name="phone_number")
	private String phone_number;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="verified")
	private boolean verified;
	
	
	public User() {
		super();
	}
	public User(int id, String phone_number, String email, String password, boolean verified) {
		super();
		this.id = id;
		this.phone_number = phone_number;
		this.email = email;
		this.password = password;
		this.verified = verified;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isVerified() {
		return verified;
	}
	public void setVerified(boolean verified) {
		this.verified = verified;
	}
	

}
