package com.revature.overknight.beans;

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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Tag")
public class Tag {
	@Id
	@Column(name="tid")
	@SequenceGenerator(sequenceName="TAG_SEQ", name="TAG_GEN")
	@GeneratedValue(generator="TAG_GEN", strategy=GenerationType.SEQUENCE)
	private Integer tid;
	@Column
	private String tag;
	
	public Tag() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tag(String tag) {
		super();
		this.tag = tag;
	}

	public Tag(Integer tid, Integer pid, String tag) {
		super();
		this.tid = tid;
		this.tag = tag;
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		return "Tag [tid=" + tid + ", tag=" + tag + "]";
	}
	
	
}
