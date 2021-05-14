package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="activations_by_staff")
public class ActivationByStaff {
	@Id
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="is_activated")
	private boolean is_activated;

	public ActivationByStaff() {
		super();
	}

	public ActivationByStaff(int user_id, boolean is_activated) {
		super();
		this.user_id = user_id;
		this.is_activated = is_activated;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public boolean isIs_activated() {
		return is_activated;
	}

	public void setIs_activated(boolean is_activated) {
		this.is_activated = is_activated;
	}

}
