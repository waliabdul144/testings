package com.service.kafqa.Service;

import com.service.kafqa.Modal.OrderEvent;
import org.springframework.stereotype.Service;

@Service
public class OrderProcessingService {

    public void process(OrderEvent event) {
        System.out.println("Processing order: " + event);
        // Save to DB, call payment service, etc.
    }
}

