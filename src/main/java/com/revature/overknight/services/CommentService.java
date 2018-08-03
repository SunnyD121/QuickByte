package com.revature.overknight.services;

import java.sql.Date;
import java.time.LocalDate;

import com.revature.overknight.beans.Comments;
import com.revature.overknight.dao.CommentDaoImpl;

public class CommentService {
	
	static CommentDaoImpl cd = new CommentDaoImpl();
	
	/**
	 * Creation of a comment with the parameters of username and comment content
	 * @param name - the username of the user that posted the comment 
	 * @param text - the content of the comment
	 * @return true if the comment is successfully posted to the database
	 */
	public static Boolean createNewComment(String name, String text)
	{
		//SETUP DATE AND CONVERT IT
		LocalDate lDate = LocalDate.now();
		Date date = java.sql.Date.valueOf( lDate );
		Comments comment = new Comments(name, date, text);
		
		
		if(cd.insertComment(comment) != null)
		{
			return true;
		}
		
		System.out.println("Sorry! You did NOT create this new comment! :(");
		return false;
		
				
	}

	public static CommentDaoImpl getCd() {
		return cd;
	}

	public static void setCd(CommentDaoImpl cd) {
		CommentService.cd = cd;
	}
	

}
