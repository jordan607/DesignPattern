package org.example;

public class SmsSender implements NotificationSender{

    private final NotificationSender notificationSender;

    public SmsSender(NotificationSender notificationSender){
        this.notificationSender = notificationSender;
    }

    @Override
    public void send() {
        if(notificationSender!=null) notificationSender.send();
        System.out.println("Sms Sent");
    }
}
