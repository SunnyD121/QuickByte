package com.revature.dao;

import java.util.List;

import com.revature.overknight.beans.CreditCard;

public interface CreditCardDao {
	public Integer insertCreditCard(CreditCard cc);
	public Boolean insertCreditCardViaSp(CreditCard cc);
	public List<CreditCard> selectAllCreditCard();
	public CreditCard selectCreditCardById(Integer id);
	public Integer deleteCreditCardById(Integer id);
	public Integer updateCreditCard(CreditCard cc);
	public CreditCard selectCreditCardByUsername(String username);
}
