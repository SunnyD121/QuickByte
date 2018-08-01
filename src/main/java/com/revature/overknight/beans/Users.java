package com.revature.overknight.beans;

import javax.persistence.*;

@Entity
@Table(name="Users")
public class Users {
	@Id
	@Column(name="user_id")
	@SequenceGenerator(sequenceName="USER_SEQ", name="UID_GEN")
	@GeneratedValue(generator="UID_GEN", strategy=GenerationType.SEQUENCE)
	private Integer id;
	@Column
	private String username;
	@Column
	private byte[] password;
	@Column
	private byte[] saltpass;
	@Column
	private Integer userStatus; //0 = banned, 1 = free user, 2 = premium user, 3 = admin, 4 = "deleted"
	@Column
	private String fName;
	@Column
	private String lName;
	@Column
	private String email;
	@Column
	private Long phone;
	@Column
	private String profileImgKey;
	@Column
	private Integer isDeleted;	//0 = not deleted, 1=deleted
	
	public Users() {
		super();
	}
	


	public Users(Integer id, String username, byte[] password, byte[] saltpass, Integer userStatus, String fName,
			String lName, String email, Long phone, String profileImgKey) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.saltpass = saltpass;
		this.userStatus = userStatus;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.phone = phone;
		this.profileImgKey = profileImgKey;
		this.isDeleted = 0;
	}
	
	

	public Users(String username, byte[] password, byte[] saltpass, Integer userStatus, String fName, String lName,
			String email, Long phone, String profileImgKey) {
		super();
		this.username = username;
		this.password = password;
		this.saltpass = saltpass;
		this.userStatus = userStatus;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.phone = phone;
		this.profileImgKey = profileImgKey;
		this.isDeleted = 0;
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

	public byte[] getPassword() {
		return password;
	}

	public void setPassword(byte[] password) {
		this.password = password;
	}
	
	public byte[] getSaltpass() {
		return saltpass;
	}

	public void setSaltpass(byte[] saltpass) {
		this.saltpass = saltpass;
	}

	public Integer getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
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

	public String getProfileImgKey() {
		return profileImgKey;
	}

	public void setProfileImgKey(String profileImgKey) {
		this.profileImgKey = profileImgKey;
	}

	
	
	public Integer getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", userStatus=" + userStatus
				+ ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", phone=" + phone
				+  ", profileImgKey=" + profileImgKey + "]";
	}

	
	
	
	
	

}
