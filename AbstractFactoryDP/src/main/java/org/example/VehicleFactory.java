package org.example;

public interface VehicleFactory extends Vehicle{
    Vehicle create();
    static VehicleFactory create(VehicleType vehicleType){
        return switch (vehicleType) {
            case CAR -> new CarFactory();
            case MOTORBIKE -> new MotorBikeFactory();
        };
    }
}

enum VehicleType{
    CAR, MOTORBIKE
}

