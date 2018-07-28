package com.revature.overknight.dao;

import java.util.List;

import com.revature.overknight.beans.Reply;

public interface ReplyDao {
	public Integer insertReply(Reply reply);
	public List<Reply> selectAllReplies();
	public List<Reply> selectAllRepliesByCId(Integer cid);
	public List<Reply> selectAllRepliesByUid(Integer uid);
	public Reply selectReplyById(Integer id);
	public Boolean deleteReplyById(Integer id);
	public Reply updateReply(Reply reply);
}
