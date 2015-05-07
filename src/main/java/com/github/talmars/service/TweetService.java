package com.github.talmars.service;

import com.github.talmars.dto.TweetDTO;
import com.github.talmars.model.Tweet;
import com.github.talmars.model.User;

import java.util.List;


public interface TweetService {

    List<Tweet> getAllTweets();
    List<Tweet> getAllTweetsThisUser(User user);
    Tweet getTweetInfo(long id);
    Tweet writeTweet(TweetDTO tweetDTO, User user);
    Tweet updateTweet(Tweet tweet);
    boolean deleteTweet(long id);

}
