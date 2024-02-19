package com.kodilla.patterns.strategy.social;


public class User {
    private String username;
    private SocialPublisher socialPublisher;

    public User(String username, SocialPublisher socialPublisher) {
        this.username = username;
        this.socialPublisher = socialPublisher;
    }

    public void sharePost() {
        System.out.print("User " + username + " is ");
        socialPublisher.share();
    }
}