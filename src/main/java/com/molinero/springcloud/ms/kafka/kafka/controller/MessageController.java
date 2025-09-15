package com.molinero.springcloud.ms.kafka.kafka.controller;

import org.springframework.web.bind.annotation.*;

import com.molinero.springcloud.ms.kafka.kafka.dto.MessagePayload;
import com.molinero.springcloud.ms.kafka.kafka.service.KafkaProducerService;

@RestController
@RequestMapping("/messages")
public class MessageController {

 private final KafkaProducerService producerService;

    public MessageController(KafkaProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping
    public String sendMessage(@RequestBody MessagePayload payload) {
        producerService.sendMessage(payload);
        return "Mensaje enviado con key=" + payload.getKey() + " value=" + payload.getValue();
    }
}
