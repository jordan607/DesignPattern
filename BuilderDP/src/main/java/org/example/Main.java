package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product.Builder()
                                .setId(1)
                                .setName("JJ")
                                .build();
        Product p2 = Product.builder()   // with this we can make builder class private
                            .setId(2)
                            .setName("Thomson")
                            .setPrice(new BigDecimal(22))
                            .build();
/*
* With Lombok
* */
        User u1 = User.builder()
                .id(3)
                .firstName("Vishal")
                .lastName("Sepaia")
                .build();

        System.out.println("Hello world!");
    }
}