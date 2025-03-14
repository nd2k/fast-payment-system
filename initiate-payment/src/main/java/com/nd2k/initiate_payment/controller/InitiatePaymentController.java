package com.nd2k.initiate_payment.controller;

import com.nd2k.initiate_payment.service.ProcessPaymentService;
import com.nd2k.library.model.common.InitiatePaymentResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pain")
@SuppressWarnings("unused")
public class InitiatePaymentController {

    private final ProcessPaymentService processPaymentService;
    private static final Logger logger = LoggerFactory.getLogger(InitiatePaymentController.class);

    public InitiatePaymentController(ProcessPaymentService processPaymentService) {
        this.processPaymentService = processPaymentService;
    }

    @RequestMapping(value = "/initiate-payment", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<InitiatePaymentResponse> initiatePayment(@RequestBody String paymentRequest) {
        logger.info("Payment request: {}", paymentRequest);
        return new ResponseEntity<>(
                processPaymentService.initiatePayment(paymentRequest),
                HttpStatus.CREATED);
    }
}
