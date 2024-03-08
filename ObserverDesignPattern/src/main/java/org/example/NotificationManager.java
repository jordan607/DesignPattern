package org.example;

public class NotificationManager implements PaymentListener{

    private void notificationSent(PaymentEvent e){
        System.out.println("Notification sent - " + e.getDate());
    }

    @Override
    public void paymentMade(PaymentEvent e) {
        notificationSent(e);
    }
}
