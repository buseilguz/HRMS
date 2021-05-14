package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job_seekers")
public class JobSeeker {
	@Id
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="identity_number")
	private String identity_number;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="year_of_birth")
	private int year_of_birth;
	
	
	
	public JobSeeker() {
		super();
	}
	public JobSeeker(int user_id, String identity_number, String first_name, String last_name, int year_of_birth) {
		super();
		this.user_id = user_id;
		this.identity_number = identity_number;
		this.first_name = first_name;
		this.last_name = last_name;
		this.year_of_birth = year_of_birth;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getIdentity_number() {
		return identity_number;
	}
	public void setIdentity_number(String identity_number) {
		this.identity_number = identity_number;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getYear_of_birth() {
		return year_of_birth;
	}
	public void setYear_of_birth(int year_of_birth) {
		this.year_of_birth = year_of_birth;
	}
	
}
