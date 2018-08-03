package com.revature.overknight.beans;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Post")
public class Post {
	@Id
	@Column( name="pid" )
	@SequenceGenerator(sequenceName="POST_SEQ", name="PID_GEN")
	@GeneratedValue(generator="PID_GEN", strategy=GenerationType.SEQUENCE)
	private Integer postId;
	@Column
	private Integer userid;
	@Column
	private String postTitle;
	@Column
	private String postImgKey;
	@Column
	private String postContent;
	@Column
	private Date postDate;
	@OneToOne
	private Tag tag;
	@OneToMany
	private List<Comments> comments;
	
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Post(Integer userid, String postTitle, String postImgKey, String postContent, Date postDate, Tag tag, List<Comments> comments) {
		super();
		this.userid = userid;
		this.postTitle = postTitle;
		this.postImgKey = postImgKey;
		this.postContent = postContent;
		this.postDate = postDate;
		this.tag = tag;
		this.comments = comments;
	}

	public Post(Integer postId, Integer userid, String postTitle, String postImgKey, String postContent, Date postDate,
			Tag tag) {
		super();
		this.postId = postId;
		this.userid = userid;
		this.postTitle = postTitle;
		this.postImgKey = postImgKey;
		this.postContent = postContent;
		this.postDate = postDate;
		this.tag = tag;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public Integer getuserid() {
		return userid;
	}

	public void setuserid(Integer userid) {
		this.userid = userid;
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

	public Tag gettag() {
		return tag;
	}

	public void settag(Tag tag) {
		this.tag = tag;
	}

	public List<Comments> getComments() {
		return comments;
	}

	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}
	
	
}
