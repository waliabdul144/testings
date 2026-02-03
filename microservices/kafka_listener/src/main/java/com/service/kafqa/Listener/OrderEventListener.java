package com.service.kafqa.Listener;

import com.service.kafqa.Modal.OrderEvent;
import com.service.kafqa.Service.OrderProcessingService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderEventListener {

    private final OrderProcessingService service;

    public OrderEventListener(OrderProcessingService service) {
        this.service = service;
    }

    @KafkaListener(
            topics = "order-created",
            groupId = "order-consumer-group"
    )
    public void listen(OrderEvent event) {
        service.process(event);
    }
}

