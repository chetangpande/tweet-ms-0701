package com.atr.tweetsms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atr.tweetsms.entity.Tweet;
import com.atr.tweetsms.repository.TweetRepo;

@Service
public class TweetImpl implements TweetService{

	@Autowired
	TweetRepo tweetRepo;
	
	@Override
	public Tweet addTweet(Tweet tweet) {
	    return tweetRepo.save(tweet);		
	}

	@Override
	public List<Tweet> getAllTweets() {		
		return tweetRepo.findAll();
	}

}
