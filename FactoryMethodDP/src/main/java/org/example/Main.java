package org.example;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Vehicle v = CarFactory.create(CarType.BMW);
        System.out.println(v);

        Vehicle v1 = CarFactory.create(CarType.PORSHE);
        System.out.println(v1);

        /*
        * Some of the examples of factory method in java
        *
        * var localDateTime = LocalDateTime.now(); //class implementation of factory
        * Path p1= Paths.get("Some Path");
        *
        * */


    }
}