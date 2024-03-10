package org.example;

public class CarFactory {
    public static Vehicle create(CarType carType){
        switch (carType){
            case BMW -> {
                return new BMW();
            }
            case PORSHE -> {
                return new Porsche();
            }
        }
        throw new IllegalArgumentException("Invalid Car type");
    }
}

enum CarType{
    BMW, PORSHE
}
