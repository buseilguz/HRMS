package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="staff")

public class Staff {
	
@Id
@Column(name="user_id")
private int user_id;

@Column(name="first_name")
private String first_name;

@Column(name="last_name")
private String last_name;

@Column(name="job_position_id")
private int job_position_id;


public Staff() {
	super();
}
public Staff(int user_id, String first_name, String last_name, int job_position_id) {
	super();
	this.user_id = user_id;
	this.first_name = first_name;
	this.last_name = last_name;
	this.job_position_id = job_position_id;
}
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
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
public int getJob_position_id() {
	return job_position_id;
}
public void setJob_position_id(int job_position_id) {
	this.job_position_id = job_position_id;
}


}
