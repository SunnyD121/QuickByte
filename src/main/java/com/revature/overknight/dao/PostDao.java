package com.revature.overknight.dao;

import java.util.List;

import com.revature.overknight.beans.Post;

public interface PostDao {
	public Integer insertPost(Post post);
	public Boolean insertPostViaSp(Post post);
	public List<Post> selectAllPost();
	public Post selectPostById(Integer id);
	public Integer deletePostById(Integer id);
	public Integer updatePost(Post post);
	public Post selectPostByUsername(String username);
}
