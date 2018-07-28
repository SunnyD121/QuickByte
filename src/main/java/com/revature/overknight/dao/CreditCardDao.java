package com.revature.overknight.dao;

import java.util.List;

import com.revature.overknight.beans.CreditCard;

public interface CreditCardDao {
	public void insertCreditCard(CreditCard cc);
	public List<CreditCard> selectAllCreditCard();
	public CreditCard updateCreditCard(CreditCard cc);
	public CreditCard selectCreditCardByUsername(Integer uid);
}
