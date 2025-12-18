package com.amit.all.systemdesign.design.patterns.behavioral.strategy.payment.factory;

import com.amit.all.systemdesign.design.patterns.behavioral.strategy.payment.strategy.CreditCardPayment;
import com.amit.all.systemdesign.design.patterns.behavioral.strategy.payment.strategy.DebitCardPayment;
import com.amit.all.systemdesign.design.patterns.behavioral.strategy.payment.strategy.PaymentStrategy;

public class PaymentFactory {

    public static PaymentStrategy getPaymentStrategy(PaymentType paymentType) {
        return switch (paymentType) {
            case DEBIT -> DebitCardPayment.getInstance();
            case CREDIT -> CreditCardPayment.getInstance();
        };
    }
}
