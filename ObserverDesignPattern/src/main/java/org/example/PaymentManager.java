package org.example;

import java.util.ArrayList;
import java.util.List;

public class PaymentManager {

    List<PaymentListener> paymentListeners = new ArrayList<>();

    public void pay(){
        PaymentEvent e = new PaymentEvent(System.currentTimeMillis());
        paymentListeners.forEach(p -> p.paymentMade(e));
    }

    void registerPaymentListener(PaymentListener p){
        paymentListeners.add(p);
    }

    void deregisterPaymentListener(PaymentListener p){
        paymentListeners.remove(p);
    }
}
