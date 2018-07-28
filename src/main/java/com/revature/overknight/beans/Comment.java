package com.revature.overknight.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	@ManyToOne
	@JoinColumn(name="pid")
	private Integer pid;
	@ManyToOne
	@JoinColumn(name="uid")
	private Integer uid;
	@Column
	private String commentContent;
	
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comment(Integer pid, Integer uid, String commentContent) {
		super();
		this.pid = pid;
		this.uid = uid;
		this.commentContent = commentContent;
	}

	public Comment(Integer cid, Integer pid, Integer uid, String commentContent) {
		super();
		this.cid = cid;
		this.pid = pid;
		this.uid = uid;
		this.commentContent = commentContent;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	@Override
	public String toString() {
		return "Comment [cid=" + cid + ", pid=" + pid + ", uid=" + uid + ", commentContent=" + commentContent + "]";
	}
	
	
}
