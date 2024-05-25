package com.example.kafkademo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerGroupB {

    @KafkaListener(topics = "topicB", groupId = "groupB")
    public void consumeGroupB(Message message) {
        System.out.println("Group B consumed message: " + message);
    }
}
