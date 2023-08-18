package com.demo.SpringBootRESTWebService.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="feedback_table")
public class FeedBack {
	@Id
	private int feedbackid;
	private String Comment;
	private int rate;
	@ManyToOne
	private Users user1;
	public int getFeedbackid() {
		return feedbackid;
	}
	public void setFeedbackid(int feedbackid) {
		this.feedbackid = feedbackid;
	}
	public String getComment() {
		return Comment;
	}
	public void setComment(String comment) {
		Comment = comment;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public Users getUser1() {
		return user1;
	}
	public void setUser1(Users user1) {
		this.user1 = user1;
	}
	public FeedBack(int feedbackid, String comment, int rate, Users user1) {
		super();
		this.feedbackid = feedbackid;
		Comment = comment;
		this.rate = rate;
		this.user1 = user1;
	}
	public FeedBack() {
		super();
	}
	@Override
	public String toString() {
		return "FeedBack [feedbackid=" + feedbackid + ", Comment=" + Comment + ", rate=" + rate + "]";
	}
	
	
		

}
