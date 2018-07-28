package com.revature.overknight.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.overknight.beans.CreditCard;
import com.revature.overknight.beans.User;
import com.revature.overknight.utils.HibernateUtil;

public class CreditCardDaoImpl implements CreditCardDao {

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
				if(cc.getUid()!=null){
					c.setUid(c.getUid());
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
