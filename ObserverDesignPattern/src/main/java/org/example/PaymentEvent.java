package org.example;

public class PaymentEvent {
    //Details needs to be send with the event
    private long date =  System.currentTimeMillis();

    public PaymentEvent(long l) {
        this.date = date;
    }

    public long getDate(){
        return this.date;
    }

}
