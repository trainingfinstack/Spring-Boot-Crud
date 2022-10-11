package in.digital.neyaj.dto;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user3")
public class UserDto {
	
	@Id
	private int id;
	private String name;
	private String address;
	private String phone;
	private String dob;
	
	public UserDto() {}

	public UserDto(int id, String name, String address, String phone, String dob) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	
	
	

}
