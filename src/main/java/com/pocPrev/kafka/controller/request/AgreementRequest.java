package com.pocPrev.kafka.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class AgreementRequest implements Serializable {

    @JsonProperty(value = "ZCLIENTS")
    private Integer zclients;
    @JsonProperty(value = "CTPDOC1")
    private Integer ctpdoc1;
    @JsonProperty(value = "DOCID")
    private String docid;

    public AgreementRequest() {
    }

    public Integer getZclients() {
        return zclients;
    }

    public void setZclients(Integer zclients) {
        this.zclients = zclients;
    }

    public Integer getCtpdoc1() {
        return ctpdoc1;
    }

    public void setCtpdoc1(Integer ctpdoc1) {
        this.ctpdoc1 = ctpdoc1;
    }

    public String getDocid() {
        return docid;
    }

    public void setDocid(String docid) {
        this.docid = docid;
    }
}
