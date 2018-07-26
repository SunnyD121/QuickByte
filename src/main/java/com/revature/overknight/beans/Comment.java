package com.revature.overknight.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Comment")
public class Comment {
	@Id
	@Column(name="cid")
	@SequenceGenerator(sequenceName="COM_SEQ", name="COM_GEN")
	@GeneratedValue(generator="COM_GEN", strategy=GenerationType.SEQUENCE)
	private Integer cid;
	@Column
	private String username;
	@Column
	private String commentContent;
	
	
	
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Comment(String username, String commentContent) {
		super();
		this.username = username;
		this.commentContent = commentContent;
	}



	public Comment(Integer cid, String username, String commentContent) {
		super();
		this.cid = cid;
		this.username = username;
		this.commentContent = commentContent;
	}



	public Integer getCid() {
		return cid;
	}



	public void setCid(Integer cid) {
		this.cid = cid;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getCommentContent() {
		return commentContent;
	}



	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}



	@Override
	public String toString() {
		return "Comment [cid=" + cid + ", username=" + username + ", commentContent=" + commentContent + "]";
	}

}
