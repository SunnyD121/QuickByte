package com.revature.overknight.dao;

import java.util.List;

import com.revature.overknight.beans.Comments;

public interface CommentDao {
	public Integer insertComment(Comments comment);
	public List<Comments> selectAllComments();
	public List<Comments> selectAllCommentsByPId(Integer pid);
	public List<Comments> selectAllCommentsByuserid(Integer userid);
	public Comments selectCommentById(Integer id);
	public Boolean deleteCommentById(Integer id);
	public Comments updateComment(Comments comment);
}
