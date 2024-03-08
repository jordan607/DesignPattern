package org.example;

public class Main {
    public static void main(String[] args) {
        PaymentManager p = new PaymentManager();

        PaymentListener p1 = new NotificationManager();
        p.registerPaymentListener(p1);

        PaymentListener p2 = new PaymentEventLogger();
        p.registerPaymentListener(p2);

        p.pay();

        p.deregisterPaymentListener(p2);
        p.pay();
    }
}