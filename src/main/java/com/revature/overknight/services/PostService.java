package com.revature.overknight.services;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.revature.overknight.beans.Comments;
import com.revature.overknight.beans.Post;
import com.revature.overknight.beans.Tag;
import com.revature.overknight.dao.UserDaoImpl;

public class PostService {
	
	TagService ts = new TagService();
	UserDaoImpl ud = new UserDaoImpl();
			
	
	public void insertNewPost(String username, String title, String imgKey, String content, String tag)
	{
		Integer userId = null;
		
		//GET USER'S ID
		userId = ud.selectUserByUsername(username).getId();
		
		// VERIFY THAT TAG EXISTS OR ADD IT IF IT DOESN'T
		Tag tagT = ts.verifyOrCreateTag(tag);
		
		//SETUP DATE AND CONVERT IT
		LocalDate lDate = LocalDate.now();
		Date date = java.sql.Date.valueOf(lDate);
		
		// CREATE "LIST" OF COMMENTS FOR POST
		List<Comments> comments = new ArrayList<>();
		Comments comment = new Comments();
		comments.add(comment);
		
		//INSERT NEW POST INTO DATABASE
		Post post = new Post(userId, title, imgKey, content, date, tagT, comments);
	}
	
	

}
