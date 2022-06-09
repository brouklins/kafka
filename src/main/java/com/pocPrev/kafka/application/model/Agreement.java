package com.pocPrev.kafka.application.model;

import com.pocPrev.kafka.application.util.JsonMapper;
import com.pocPrev.kafka.controller.request.AgreementRequest;

import java.io.Serializable;

public class Agreement implements Serializable {

    private AgreementRequest agreementRequest;
    private String key;
    private String value;

    public Agreement(AgreementRequest agreementRequest) {
        setValue(agreementRequest);
        setKey(agreementRequest);
        this.agreementRequest = agreementRequest;
    }

    private void setKey(AgreementRequest agreementRequest) {
        String toJson = new JsonMapper<>()
                .objectToJsonWithNoBreakLines(new AgreementKey(agreementRequest.getZclients()));
        this.key = toJson;
    }

    private void setValue(AgreementRequest agreementRequest) {
        String toJson = new JsonMapper<>()
                .objectToJsonWithNoBreakLines(agreementRequest);
        this.value = toJson;
    }

    public String messageKey() {
        return this.key;
    }

    public String messageValue() {
        return this.value;
    }
}
