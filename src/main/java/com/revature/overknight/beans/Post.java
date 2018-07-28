package com.revature.overknight.beans;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
	@ManyToOne
	@JoinColumn(name="uid")
	private Integer uid;
	@Column
	private String postTitle;
	@Column
	private String postImgKey;
	@Column
	private String postContent;
	@Column
	private Date postDate;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="Tag_2_Post", joinColumns=@JoinColumn(name="pid"),
				inverseJoinColumns=@JoinColumn(name="tid"))
	private List<Tag> tags;
	
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Post(Integer uid, String postTitle, String postImgKey, String postContent, Date postDate, List<Tag> tags) {
		super();
		this.uid = uid;
		this.postTitle = postTitle;
		this.postImgKey = postImgKey;
		this.postContent = postContent;
		this.postDate = postDate;
		this.tags = tags;
	}

	public Post(Integer postId, Integer uid, String postTitle, String postImgKey, String postContent, Date postDate,
			List<Tag> tags) {
		super();
		this.postId = postId;
		this.uid = uid;
		this.postTitle = postTitle;
		this.postImgKey = postImgKey;
		this.postContent = postContent;
		this.postDate = postDate;
		this.tags = tags;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
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

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	
	
}
