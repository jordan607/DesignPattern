package org.example;

public class PaymentEventLogger implements PaymentListener {
    private void paymentLogged(){
        System.out.println("Payment received");
    }

    @Override
    public void paymentMade(PaymentEvent e) {
        paymentLogged();
    }
}
