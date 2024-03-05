package com.kodilla.patterns.strategy.social;


public class User {
    private String username;
    private SocialPublisher socialPublisher;

    public User(String username, SocialPublisher socialPublisher) {
        this.username = username;
        this.socialPublisher = socialPublisher;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public String sharePost() {
        return socialPublisher.share();

    }
}