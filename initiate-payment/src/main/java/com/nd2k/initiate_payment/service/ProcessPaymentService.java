package com.nd2k.initiate_payment.service;

import com.nd2k.library.model.common.InitiatePaymentResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ProcessPaymentService {

    private static final Logger logger = LoggerFactory.getLogger(ProcessPaymentService.class);

    public InitiatePaymentResponse initiatePayment(String paymentRequest) {
        logger.info("Payment Initiation Request --- {}", paymentRequest);
        return InitiatePaymentResponse.builder()
                .message("Payment successfully processed")
                .build();
    }
}
