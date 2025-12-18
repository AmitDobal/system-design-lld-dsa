package com.amit.all.systemdesign.design.patterns.behavioral.strategy.payment.strategy;

public class DebitCardPayment implements PaymentStrategy{

    private  static final DebitCardPayment INSTANCE = new DebitCardPayment();

    private DebitCardPayment(){
    }

    public static DebitCardPayment getInstance(){
        return INSTANCE;
    }

    @Override
    public void pay(){
        System.out.println("Debit Card Payment");
    }
}
