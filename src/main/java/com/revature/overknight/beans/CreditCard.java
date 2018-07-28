package com.revature.overknight.beans;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CreditCard")
public class CreditCard {
	@Id
	@Column(name="ccn")
	private Integer creditCardNumber;
	@ManyToOne
	@JoinColumn(name="uid")
	private Integer uid;
	@Column
	private String cHName;
	@Column
	private Date expirationDate;
	@Column
	private Integer cVV2;
	@Column
	private String bAddress;
	@Column
	private String eSign;
	
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreditCard(Integer creditCardNumber, Integer uid, String cHName, Date expirationDate, Integer cVV2,
			String bAddress, String eSign) {
		super();
		this.creditCardNumber = creditCardNumber;
		this.uid = uid;
		this.cHName = cHName;
		this.expirationDate = expirationDate;
		this.cVV2 = cVV2;
		this.bAddress = bAddress;
		this.eSign = eSign;
	}

	public Integer getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(Integer creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getcHName() {
		return cHName;
	}

	public void setcHName(String cHName) {
		this.cHName = cHName;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Integer getcVV2() {
		return cVV2;
	}

	public void setcVV2(Integer cVV2) {
		this.cVV2 = cVV2;
	}

	public String getbAddress() {
		return bAddress;
	}

	public void setbAddress(String bAddress) {
		this.bAddress = bAddress;
	}

	public String geteSign() {
		return eSign;
	}

	public void seteSign(String eSign) {
		this.eSign = eSign;
	}

	@Override
	public String toString() {
		return "CreditCard [creditCardNumber=" + creditCardNumber + ", uid=" + uid + ", cHName=" + cHName
				+ ", expirationDate=" + expirationDate + ", cVV2=" + cVV2 + ", bAddress=" + bAddress + ", eSign="
				+ eSign + "]";
	}

}
