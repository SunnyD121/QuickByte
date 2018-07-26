package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	@Id
	@Column(name="uid")
	@SequenceGenerator(sequenceName="USER_SEQ", name="UID_GEN")
	@GeneratedValue(generator="UID_GEN", strategy=GenerationType.SEQUENCE)
	private Integer id;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private Integer userType; //0 = regular user, 1 = premium user, 2 = administrator
	@Column
	private String fName;
	@Column
	private String lName;
	@Column
	private String email;
	@Column
	private Long phone;
	@Column
	private Long creditCardNumber;
	@Column
	private String profileImgKey;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String username, String password, Integer userType, String fName, String lName,
			String email, Long phone, Long creditCardNumber) {
		super();
		this.username = username;
		this.password = password;
		this.userType = userType;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.phone = phone;
		this.creditCardNumber = creditCardNumber;
	}

	public User(Integer id, String username, String password, Integer userType, String fName, String lName,
			String email, Long phone, Long creditCardNumber) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.userType = userType;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.phone = phone;
		this.creditCardNumber = creditCardNumber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Long getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(Long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	
	

}
