package com.pocPrev.kafka.application.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AgreementKey {

    @JsonProperty(value = "ZCLIENTS")
    private Integer zclients;

    public AgreementKey(Integer zclients) {
        this.zclients = zclients;
    }

    public Integer getZclients() {
        return zclients;
    }

    public void setZclients(Integer zclients) {
        this.zclients = zclients;
    }
}
