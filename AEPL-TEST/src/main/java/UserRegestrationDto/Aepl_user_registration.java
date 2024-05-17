package UserRegestrationDto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aepl_user_registration {

	@Id
	private long mobileNO;
	private String name;
	private String email;
	private String location;
	private String dob;

	public long getMobileNO() {
		return mobileNO;
	}

	public void setMobileNO(long mobileNO) {
		this.mobileNO = mobileNO;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

}
