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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Comments")
public class Comments {
	@Id
	@SequenceGenerator(sequenceName="COM_SEQ", name="COM_GEN")
	@GeneratedValue(generator="COM_GEN", strategy=GenerationType.SEQUENCE)
	private Integer cid;
	private String commentName;
	private Date date;
	private String commentText;
	@OneToMany
	private List<Comments> replies;
	
	
	
	
	public Comments() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Comments(String commentName, Date date, String commentText) {
		super();
		this.commentName = commentName;
		this.date = date;
		this.commentText = commentText;
	}


	public Comments(String commentName, String commentText, List<Comments> replies) {
		super();
		this.commentName = commentName;
		this.commentText = commentText;
		this.replies = replies;
	}
	
	public Comments(Integer cid, String commentName, String commentText, List<Comments> replies) {
		super();
		this.cid = cid;
		this.commentName = commentName;
		this.commentText = commentText;
		this.replies = replies;
	}


	public Integer getCid() 
	{
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCommentName() {
		return commentName;
	}

	public void setCommentName(String commentName) {
		this.commentName = commentName;
	}


	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCommentText() {
		return commentText;
	}


	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}


	public List<Comments> getReplies() {
		return replies;
	}


	public void setReplies(List<Comments> replies) {
		this.replies = replies;
	}

	
	
	
}
