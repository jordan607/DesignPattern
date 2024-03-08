package org.example;

public class Main {
    public static void main(String[] args) {
        SmsSender smsSender = new SmsSender(new EmailSender(null));
        EmailSender emailSender = new EmailSender(new SmsSender(new SmsSender(null)));

        smsSender.send();
        System.out.println("-------------------------------------------");
        emailSender.send();

    }
}