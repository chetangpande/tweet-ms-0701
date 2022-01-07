package com.atr.tweetsms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tweet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int tweetID;
	
	String tweetUserName;
	
	String tweetMessage;
		

	public Tweet() {
		super();
	}

	public Tweet(int tweetID, String tweetUserName, String tweetMessage) {
		super();
		this.tweetID = tweetID;
		this.tweetUserName = tweetUserName;
		this.tweetMessage = tweetMessage;
	}

	public int getTweetID() {
		return tweetID;
	}

	public void setTweetID(int tweetID) {
		this.tweetID = tweetID;
	}

	public String getTweetUserName() {
		return tweetUserName;
	}

	public void setTweetUserName(String tweetUserName) {
		this.tweetUserName = tweetUserName;
	}

	public String getTweetMessage() {
		return tweetMessage;
	}

	public void setTweetMessage(String tweetMessage) {
		this.tweetMessage = tweetMessage;
	}

	@Override
	public String toString() {
		return "Tweet [tweetID=" + tweetID + ", tweetUserName=" + tweetUserName + ", tweetMessage=" + tweetMessage
				+ "]";
	}
	
	

}
