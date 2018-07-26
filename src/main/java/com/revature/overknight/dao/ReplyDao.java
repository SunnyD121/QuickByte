package com.revature.overknight.dao;

import java.util.List;

import com.revature.overknight.beans.Reply;

public interface ReplyDao {
	public Integer insertReply(Reply reply);
	public Boolean insertReplyViaSp(Reply reply);
	public List<Reply> selectAllReply();
	public Reply selectReplyById(Integer id);
	public Integer deleteReplyById(Integer id);
	public Integer updateReply(Reply reply);
	public Reply selectReplyByUsername(String username);
}
