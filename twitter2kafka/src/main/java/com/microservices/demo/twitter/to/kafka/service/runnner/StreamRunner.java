package com.microservices.demo.twitter.to.kafka.service.runnner;

import twitter4j.TwitterException;

public interface StreamRunner {

    void start() throws TwitterException;

}
