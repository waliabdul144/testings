package com.service.kafqa.Service;

import com.service.kafqa.Modal.OrderEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private static final String TOPIC = "my_topic";
    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(OrderEvent message) {
        kafkaTemplate.send(TOPIC, String.valueOf(message));
        System.out.println("Message sent: " + message);
    }
}