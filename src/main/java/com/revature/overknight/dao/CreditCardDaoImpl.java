package com.revature.overknight.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.overknight.beans.CreditCard;
import com.revature.overknight.beans.Users;
import com.revature.overknight.utils.HibernateUtil;

public class CreditCardDaoImpl implements CreditCardDao {
	/**
	 * Inserts credit card into the database
	 * @param cc - The CreditCard object that is presisted to the database
	 */
	public void insertCreditCard(CreditCard cc) {
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		
		try{
			trans = session.beginTransaction();
			session.save(cc);
			trans.commit();
			
		}catch(HibernateException e){
			if(trans!=null){
				trans.rollback();
			}
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
	/**
	 * Selects all of the credit cards that is currently in the database
	 * @return a list of all the credit cards
	 * */
	public List<CreditCard> selectAllCreditCard() {
		List<CreditCard> ccs = null; 
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		
		try{
			trans = session.beginTransaction();
			ccs = session.createQuery("FROM CreditCard").list();
						
		}catch(HibernateException e){
			if(trans!=null){
				trans.rollback();
			}
			e.printStackTrace();
		}finally{
			session.close();
		}
		return ccs;
	}
	/**
	 * Removes a credit card from the database by credit card number
	 * @param ccn - credit card number; the primary key
	 * @return true if user is successfully removed, false otherwise
	 */
	public Boolean deleteCreditCardByCCN(Integer ccn) {
		CreditCard cc = null;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		Boolean result = false;

		try{
			trans = session.beginTransaction();
			cc = (CreditCard)session.get(CreditCard.class, ccn);
			if(cc!=null){
				session.delete(cc);
				result = true;
			}
			trans.commit();
			
		}catch(HibernateException e){
			if(trans!=null){
				trans.rollback();
			}
			e.printStackTrace();
		}finally{
			session.close(); 
		}
		return result;
	}
	/**
	 * Updates the credit card information in the database
	 * @param cc - the CreditCard object to be updated
	 * return the CreditCard object that was updated
	 */
	public CreditCard updateCreditCard(CreditCard cc) {
		CreditCard c = null;
		Session session = HibernateUtil.getSession();
		Transaction trans = null;

		try{
			trans = session.beginTransaction();
			c = (CreditCard)session.get(CreditCard.class, cc.getCreditCardNumber());
			
			
			if(null != c){
				if(cc.getCreditCardNumber()!=null){
					c.setCreditCardNumber(c.getCreditCardNumber());
				}
				if(cc.getusers() !=null){
					c.setusers(c.getusers());
				}
				if(cc.getcHName()!=null){
					c.setcHName(c.getcHName());
				}
				if(cc.getExpirationDate()!=null){
					c.setExpirationDate(c.getExpirationDate());
				}
				if(cc.getcVV2()!=null){
					c.setcVV2(c.getcVV2());
				}
				if(cc.getbAddress()!=null){
					c.setbAddress(c.getbAddress());
				}
				if(cc.geteSign()!=null){
					c.seteSign(c.geteSign());
				}
				
				session.save(c);
			}
			trans.commit();
			
		}catch(HibernateException e){
			if(trans!=null){
				trans.rollback();
			}
			e.printStackTrace();
		}finally{
			session.close(); 
		}
		return cc;
	}
	/**
	 * Selects a credit card from the database by its associated uid
	 * @param uid - a foreign key that links this table to the Users table
	 * @return a Credit Card object that is associated with the uid 
	 */
	public CreditCard selectCreditCardByUsername(Integer uid) {
		Session session = HibernateUtil.getSession();
		Transaction trans = null;
		CreditCard cc = null;
		
		try {
			trans = session.beginTransaction();
			
			cc = (CreditCard)session.get(CreditCard.class, uid);
			
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(trans!=null){
				trans.rollback();
			}
		}finally {
			session.close();
		}
			
		return cc; 
	}

	

}
