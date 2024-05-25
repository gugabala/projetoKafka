package com.example.kafkademo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerGroupA {

    @KafkaListener(topics = "topicA", groupId = "groupA")
    public void consumeGroupA(Message message) {
        System.out.println("Group A consumed message: " + message);
    }
}
