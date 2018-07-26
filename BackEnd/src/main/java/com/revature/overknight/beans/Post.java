package com.revature.beans;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Post")
public class Post {
	@Id
	@Column(name="pid")
	@SequenceGenerator(sequenceName="POST_SEQ", name="PID_GEN")
	@GeneratedValue(generator="PID_GEN", strategy=GenerationType.SEQUENCE)
	private Integer postId;
	@Column
	private String postTitle;
	@Column
	private String username;
	@Column
	private String postImgKey;
	@Column
	private String postContent;
	@Column
	private Date postDate;
	
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Post(String postTitle, String username, String postImgKey, String postContent, Date postDate) {
		super();
		this.postTitle = postTitle;
		this.username = username;
		this.postImgKey = postImgKey;
		this.postContent = postContent;
		this.postDate = postDate;
	}


	public Post(Integer postId, String postTitle, String username, String postImgKey, String postContent,
			Date postDate) {
		super();
		this.postId = postId;
		this.postTitle = postTitle;
		this.username = username;
		this.postImgKey = postImgKey;
		this.postContent = postContent;
		this.postDate = postDate;
	}


	public Integer getPostId() {
		return postId;
	}


	public void setPostId(Integer postId) {
		this.postId = postId;
	}


	public String getPostTitle() {
		return postTitle;
	}


	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPostImgKey() {
		return postImgKey;
	}


	public void setPostImgKey(String postImgKey) {
		this.postImgKey = postImgKey;
	}


	public String getPostContent() {
		return postContent;
	}


	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}


	public Date getPostDate() {
		return postDate;
	}


	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}


	@Override
	public String toString() {
		return "Post [postId=" + postId + ", postTitle=" + postTitle + ", username=" + username + ", postImgKey="
				+ postImgKey + ", postContent=" + postContent + ", postDate=" + postDate + "]";
	}
	
	
}
