package com.revature.overknight.dao;

import java.util.List;

import com.revature.overknight.beans.Post;

public interface PostDao {
	public Integer insertPost(Post post);
	public List<Post> selectAllPosts();
	public List<Post> selectAllPostsByUsername(String username);
	public Post selectPostById(Integer id);
	public Boolean deletePostById(Integer id);
	public Post updatePost(Post post);
	public Post selectPostByUsername(String username);
}
