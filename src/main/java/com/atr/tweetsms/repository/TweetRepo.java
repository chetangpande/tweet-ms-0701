package com.atr.tweetsms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.stereotype.Repository;

import com.atr.tweetsms.entity.Tweet;

@Repository
public interface TweetRepo extends  JpaRepository<Tweet, Long>{

}
