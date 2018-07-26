package com.revature.dao;

import java.util.List;

import com.revature.beans.Post;
import com.revature.beans.User;

public interface PostDao {
	public Integer insertPost(Post post);
	public List<Post> selectAllPost();
	public Post selectPostById(Integer id);
	public Boolean deletePostById(Integer id);
	public Post updatePost(Post post);
	public Post selectPostByUsername(String username);
}
