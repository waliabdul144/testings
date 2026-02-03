package com.service.kafqa.Service;

import com.service.kafqa.Modal.OrderEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "my_topic", groupId = "group_id")
    public void listen(String message) {
        System.out.println("Message received: " + message);
        // Process your message here
    }
}

