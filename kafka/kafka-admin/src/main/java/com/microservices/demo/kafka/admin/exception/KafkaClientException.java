package com.microservices.demo.kafka.admin.exception;

public class KafkaClientException extends RuntimeException {

    public KafkaClientException() {

    }

    public KafkaClientException(String s, Exception e) {
        super(s, e);
    }

    public KafkaClientException(String s) {
        super(s);
    }
}
