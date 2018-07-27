package com.revature.dao;

import java.util.List;

import com.revature.beans.Reply;

public interface ReplyDao {
	public Integer insertReply(Reply reply);
	public List<Reply> selectAllReply();
	public List<Reply> selectAllReplyByCId(Integer cid);
	public Reply selectReplyById(Integer id);
	public Boolean deleteReplyById(Integer id);
	public Reply updateReply(Reply reply);
	public Reply selectReplyByUsername(String username);
}
