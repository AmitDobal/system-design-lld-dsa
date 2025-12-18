package com.amit.all.systemdesign.design.patterns.behavioral.strategy.payment.strategy;

public class CreditCardPayment implements PaymentStrategy{

    private static final CreditCardPayment INSTANCE = new CreditCardPayment();

    private CreditCardPayment(){
    }

    public static CreditCardPayment getInstance(){
        return INSTANCE;
    }

    @Override
    public void pay(){
        System.out.println("Credit Card Payment");
    }
}
