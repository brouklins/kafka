package com.pocPrev.kafka.application.usecase;

import com.pocPrev.kafka.application.model.Agreement;

public interface UseCaseToNotifyAgreement {

    void sendMessage(Agreement agreement);
}
