package com.revature.overknight.dao;

import java.util.List;

import com.revature.overknight.beans.Post;
import com.revature.overknight.beans.Tag;

public interface PostDao {
	public Integer insertPost(Post post);
	public List<Post> selectAllPosts();
	public List<Post> selectAllPostsByuserid(Integer userid);
	public List<Post> selectAllPostsByTag(Tag t);
	public Post selectPostById(Integer id);
	public Boolean deletePostById(Integer id);
	public Post updatePost(Post post);
}