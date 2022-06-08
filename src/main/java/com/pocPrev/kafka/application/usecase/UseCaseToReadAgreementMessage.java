package com.pocPrev.kafka.application.usecase;

public interface UseCaseToReadAgreementMessage {
    void processNotification(String key, String value);
}
