package com.revature.overknight.beans;

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
public class Comment {
	@Id
	@SequenceGenerator(sequenceName="COM_SEQ", name="COM_GEN")
	@GeneratedValue(generator="COM_GEN", strategy=GenerationType.SEQUENCE)
	private Integer cid;
	private String commentContent;
	@OneToMany
	private List<Reply> replies;
	
	
	
	
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comment(Integer cid, String commentContent, List<Reply> replies) {
		super();
		this.cid = cid;
		this.commentContent = commentContent;
		this.replies = replies;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	@Override
	public String toString() {
		return "Comment [cid=" + cid + ", commentContent=" + commentContent + "]";
	}
	
	
}
