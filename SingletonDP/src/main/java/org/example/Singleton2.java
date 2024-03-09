package org.example;

public class Singleton2 {
    private static Singleton2 instance = null;

    private Singleton2(){}

    public static synchronized Singleton2 getInstance(){ // worst possible solution
        if(instance==null) instance = new Singleton2();
        return instance;
    }
}
