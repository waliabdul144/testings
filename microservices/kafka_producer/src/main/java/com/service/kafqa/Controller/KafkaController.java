package com.service.kafqa.Controller;

import com.service.kafqa.Modal.OrderEvent;
import com.service.kafqa.Service.KafkaProducerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    private final KafkaProducerService producerService;

    public KafkaController(KafkaProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping("/send")
    public String sendMessage(@RequestBody OrderEvent message) {
        producerService.sendMessage(message);
        return "Message sent successfully!";
    }
}