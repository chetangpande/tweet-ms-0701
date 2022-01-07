package com.atr.tweetsms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atr.tweetsms.entity.Tweet;
import com.atr.tweetsms.service.TweetImpl;

@RestController
@RequestMapping("/tweets")
public class TweetsController {
	@Autowired
	TweetImpl tweetService;
	
	@GetMapping("/hello")
	public String SayHello(){
		return "Hello";
	}
	
	@PostMapping("/add")
	public Tweet postNewTweet(@RequestBody Tweet tweet){
		return tweetService.addTweet(tweet);		
	}
	
	@GetMapping("/all")
	public List<Tweet> getAllTweets(){
		return tweetService.getAllTweets();		
	}

}
