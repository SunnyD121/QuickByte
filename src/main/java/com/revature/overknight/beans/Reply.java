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
@Table(name="Reply")
public class Reply {
	@Id
	@Column(name="rid")
	@SequenceGenerator(sequenceName="REP_SEQ", name="REP_GEN")
	@GeneratedValue(generator="REP_GEN", strategy=GenerationType.SEQUENCE)
	private Integer rid;
	@Column
	private String userid;
	@Column
	private String replyContent;
	
	
	public Reply() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Reply(String userid, String replyContent) {
		super();
		this.userid = userid;
		this.replyContent = replyContent;
	}


	public Reply(Integer rid, String userid, String replyContent) {
		super();
		this.rid = rid;
		this.userid = userid;
		this.replyContent = replyContent;
	}


	public Integer getRid() {
		return rid;
	}


	public void setRid(Integer rid) {
		this.rid = rid;
	}


	public String getuserid() {
		return userid;
	}


	public void setuserid(String userid) {
		this.userid = userid;
	}


	public String getReplyContent() {
		return replyContent;
	}


	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}


	@Override
	public String toString() {
		return "Reply [rid=" + rid + ", userid=" + userid + ", replyContent=" + replyContent + "]";
	}


	
	
		
}
