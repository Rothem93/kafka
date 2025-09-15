package com.molinero.springcloud.ms.kafka.kafka.service;

import com.molinero.springcloud.ms.kafka.kafka.dto.MessagePayload;

public interface KafkaConsumerServices {

    void consume(MessagePayload message);

}
