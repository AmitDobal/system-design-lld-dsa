package com.amit.all.systemdesign.design.patterns.behavioral.strategy.payment;

import com.amit.all.systemdesign.design.patterns.behavioral.strategy.payment.factory.PaymentFactory;
import com.amit.all.systemdesign.design.patterns.behavioral.strategy.payment.factory.PaymentType;
import com.amit.all.systemdesign.design.patterns.behavioral.strategy.payment.service.PaymentService;

public class PaymentMain {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        paymentService.setPaymentStrategy(PaymentFactory.getPaymentStrategy(PaymentType.DEBIT));
        paymentService.processPayment();

        paymentService.setPaymentStrategy(PaymentFactory.getPaymentStrategy(PaymentType.CREDIT));
        paymentService.processPayment();
    }
}
