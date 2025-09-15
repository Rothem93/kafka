package com.molinero.springcloud.ms.kafka.kafka.service.impl.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.molinero.springcloud.ms.kafka.kafka.dto.MessagePayload;
import com.molinero.springcloud.ms.kafka.kafka.service.KafkaProducerService;

@Service
public class KafkaProducerServiceImpl implements KafkaProducerService{

    private final KafkaTemplate<String, Object> kafkaTemplate;
    private static final String TOPIC = "mutua-example";

    public KafkaProducerServiceImpl(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(MessagePayload payload) {
        kafkaTemplate.send(TOPIC, payload.getKey(), payload);
        System.out.println("Mensaje enviado con key=" + payload.getKey() + " value=" + payload.getValue());
    }
}
