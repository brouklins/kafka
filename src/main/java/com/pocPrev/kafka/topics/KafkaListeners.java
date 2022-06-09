package com.pocPrev.kafka.topics;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    //Configura os tópicos que vamos receber a mensagem
    @KafkaListener(
            topics = "prevTopic",
            groupId = "groupId"
    )
    void listener(
            @Header(name = KafkaHeaders.RECEIVED_MESSAGE_KEY, required = false) String key,
            @Header(KafkaHeaders.RECEIVED_TIMESTAMP) long ts,
            @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,
            @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition,
            @Payload(required = false) String data) {
        System.out.println("KEY: " + key + " || payload: " + data + " || timestamp: " + ts + " || topic: " + topic + " || partition: " + partition);
    }
}
