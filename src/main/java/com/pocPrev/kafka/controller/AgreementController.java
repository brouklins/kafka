package com.pocPrev.kafka.controller;

import com.pocPrev.kafka.controller.request.AgreementRequest;
import com.pocPrev.kafka.application.model.Agreement;
import com.pocPrev.kafka.application.usecase.UseCaseToNotifyAgreement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/agreement")
public class AgreementController {

    private final UseCaseToNotifyAgreement useCaseToNotifyAgreement;

    public AgreementController(UseCaseToNotifyAgreement useCaseToNotifyAgreement) {
        this.useCaseToNotifyAgreement = useCaseToNotifyAgreement;
    }

    @PostMapping
    public void send(@RequestBody AgreementRequest agreementRequest) {
        useCaseToNotifyAgreement.sendMessage(new Agreement(agreementRequest));
    }
}
