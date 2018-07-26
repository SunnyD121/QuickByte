package com.revature.overknight.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Reply")
public class Reply {
	@Id
	@Column(name="rid")
	@SequenceGenerator(sequenceName="REP_SEQ", name="REP_GEN")
	@GeneratedValue(generator="REP_GEN", strategy=GenerationType.SEQUENCE)
	private Integer rid;
	@Column
	private String username;
	@Column
	private String replyContent;
	
	
	public Reply() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Reply(String username, String replyContent) {
		super();
		this.username = username;
		this.replyContent = replyContent;
	}


	public Reply(Integer rid, String username, String replyContent) {
		super();
		this.rid = rid;
		this.username = username;
		this.replyContent = replyContent;
	}


	public Integer getRid() {
		return rid;
	}


	public void setRid(Integer rid) {
		this.rid = rid;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getReplyContent() {
		return replyContent;
	}


	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}


	@Override
	public String toString() {
		return "Reply [rid=" + rid + ", username=" + username + ", replyContent=" + replyContent + "]";
	}
	
}
