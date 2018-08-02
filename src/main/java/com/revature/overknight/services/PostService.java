package com.revature.overknight.services;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.revature.overknight.beans.Comments;
import com.revature.overknight.beans.Post;
import com.revature.overknight.beans.Tag;

import gherkin.formatter.model.Comment;

public class PostService {
	
	TagService ts = new TagService();
			
	
	public void insertNewPost(Integer userid, String title, String imgKey, String content, String tag)
	{
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
		Post post = new Post(userid, title, imgKey, content, date, tagT, comments);
	}
	
	

}
