package org.example;

public class Main {
    public static void main(String[] args) {

        VehicleFactory vehicleFactory1 = VehicleFactory.create(VehicleType.CAR);
        Vehicle vehicle1 = vehicleFactory1.create();
        System.out.println(vehicle1);

        VehicleFactory vehicleFactory2 = VehicleFactory.create(VehicleType.MOTORBIKE);
        Vehicle vehicle2 = vehicleFactory2.create();
        System.out.println(vehicle2);


        /*
        * Example in java
        *
        * EntityManagerFactory emf = Persistence.createEntityManagerFactory(); //persistence.xml
        * EntityManager em = emf.createEntityManager();
        *
        * */
    }
}