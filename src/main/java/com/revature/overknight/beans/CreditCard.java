package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CreditCard")
public class CreditCard {
	@Id
	@Column(name="ccn")
	private Integer creditCardNumber;
	@Column
	private Integer userID;


	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CreditCard(Integer creditCardNumber, Integer userID) {
		super();
		this.creditCardNumber = creditCardNumber;
		this.userID = userID;
	}


	public Integer getCreditCardNumber() {
		return creditCardNumber;
	}


	public void setCreditCardNumber(Integer creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}


	public Integer getUserID() {
		return userID;
	}


	public void setUserID(Integer userID) {
		this.userID = userID;
	}


	@Override
	public String toString() {
		return "CreditCard [creditCardNumber=" + creditCardNumber + ", userID=" + userID + "]";
	}
}
