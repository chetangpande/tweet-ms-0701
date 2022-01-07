package com.atr.tweetsms.service;

import java.util.List;

import com.atr.tweetsms.entity.Tweet;

public interface TweetService {
	
	public Tweet addTweet(Tweet tweet);
	public List<Tweet> getAllTweets();

}
