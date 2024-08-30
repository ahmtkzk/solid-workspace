package com.ahmtkzk.solidtest.dependencyinversion;

import org.springframework.stereotype.Service;

@Service
public class PayPalPaymentService implements PaymentService{
    @Override
    public void processPayment(String order) {

    }
}
