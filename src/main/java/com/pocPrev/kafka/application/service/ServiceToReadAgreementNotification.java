package com.pocPrev.kafka.application.service;

import com.pocPrev.kafka.application.usecase.UseCaseToReadAgreementMessage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class ServiceToReadAgreementNotification implements UseCaseToReadAgreementMessage {
    @Value("${prev.topic2}")
    private String prevTopic;
    static Logger log = Logger.getLogger(ServiceToReadAgreementNotification.class.getName());

    @Override
    @KafkaListener(
            topics = "${prev.topic2}",
            groupId = "groupId"
    )
    public void processNotification(
            @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String key,
            @Payload(required = false) String value) {
        log.info("key: " + key + " || value: " + value);
    }
}
