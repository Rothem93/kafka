package com.molinero.springcloud.ms.kafka.kafka.service.impl.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.molinero.springcloud.ms.kafka.kafka.dto.MessagePayload;
import com.molinero.springcloud.ms.kafka.kafka.service.KafkaConsumerServices;

@Service
public class KafkaConsumerServiceImpl implements KafkaConsumerServices{
    
    @KafkaListener(topics = "mutua-example", groupId = "demo-group")
    public void consume(MessagePayload message) {
        System.out.println(" Mensaje recibido -> key=" + message.getKey() + " value=" + message.getValue());
    }

}
