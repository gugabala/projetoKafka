package com.example.kafkademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, Message> kafkaTemplate;

    @PostMapping("/publish")
    public String publishMessage(@RequestParam("topic") String topic, @RequestBody Message message) {
        kafkaTemplate.send(topic, message);
        return "Message published to " + topic;
    }
}
