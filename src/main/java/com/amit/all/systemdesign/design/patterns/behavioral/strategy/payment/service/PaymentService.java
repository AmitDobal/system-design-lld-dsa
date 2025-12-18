package com.amit.all.systemdesign.design.patterns.behavioral.strategy.payment.service;

import com.amit.all.systemdesign.design.patterns.behavioral.strategy.payment.strategy.PaymentStrategy;

public class PaymentService {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(){
        this.paymentStrategy.pay();
    }
}
