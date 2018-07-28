package com.revature.overknight.dao;

import java.util.List;

import com.revature.overknight.beans.Post;
import com.revature.overknight.beans.Tag;

public interface TagDao {
	public Integer insertTag(Tag tag);
	public List<Tag> selectAllTags();
	public List<Tag> selectAllTagByPost(Post p);
	public Tag selectTagById(Integer id);
	public Boolean deleteTagById(Integer id);
	public Tag updateTag(Tag tag);
}
