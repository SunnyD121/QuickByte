package com.revature.overknight.dao;

import java.util.List;

import com.revature.overknight.beans.Comment;

public interface CommentDao {
	public Integer insertComment(Comment comment);
	public List<Comment> selectAllComments();
	public List<Comment> selectAllCommentsByPId(Integer pid);
	public List<Comment> selectAllCommentsByuserid(Integer userid);
	public Comment selectCommentById(Integer id);
	public Boolean deleteCommentById(Integer id);
	public Comment updateComment(Comment comment);
}
