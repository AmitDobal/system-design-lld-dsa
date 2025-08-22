package com.amit.systemdesign.design.patterns.behavioral.strategy.payment.factory;

import com.amit.systemdesign.design.patterns.behavioral.strategy.payment.strategy.CreditCardPayment;
import com.amit.systemdesign.design.patterns.behavioral.strategy.payment.strategy.DebitCardPayment;
import com.amit.systemdesign.design.patterns.behavioral.strategy.payment.strategy.PaymentStrategy;

public class PaymentFactory {

    public static PaymentStrategy getPaymentStrategy(PaymentType paymentType) {
        switch (paymentType) {
            case DEBIT:
                return DebitCardPayment.getInstance();
            case CREDIT:
                return CreditCardPayment.getInstance();
            default:
                throw new IllegalArgumentException("Unsupported  payment type: " + paymentType);
        }

    }
}
