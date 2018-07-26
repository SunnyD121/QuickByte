package com.revature.dao;

import java.util.List;

import com.revature.beans.Comment;

public interface CommentDao {
	public Integer insertComment(Comment comment);
	public Boolean insertCommentViaSp(Comment comment);
	public List<Comment> selectAllComment();
	public Comment selectCommentById(Integer id);
	public Integer deleteCommentById(Integer id);
	public Integer updateComment(Comment comment);
	public Comment selectCommentByUsername(String username);
}
