package com.revature.overknight.dao;

import java.util.List;

import com.revature.overknight.beans.Comments;

public interface CommentDao {
	public Integer insertComment(Comments comment);
	public List<Comments> selectAllComments();
	public Comments selectCommentById(Integer id);
	public Comments updateComment(Comments comment);
}
