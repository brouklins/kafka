package com.pocPrev.kafka.application.service;

import com.pocPrev.kafka.application.model.Agreement;
import com.pocPrev.kafka.application.usecase.UseCaseToNotifyAgreement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ServiceToNotifyAgreement implements UseCaseToNotifyAgreement {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Value("${prev.topic2}")
    private String prevTopic;

    public ServiceToNotifyAgreement(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void sendMessage(Agreement agreement) {
        kafkaTemplate.send(prevTopic, agreement.messageKey(), agreement.messageValue());
    }
}
