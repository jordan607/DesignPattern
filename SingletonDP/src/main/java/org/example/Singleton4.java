package org.example;

/*
* Best one to use among all the 5, since class will be loaded nly once by the class loader and hence the object will be created
* only once and this will be handled better that creating object with synchronise block.
* This works when we have only 1 class loader.
* */
public class Singleton4 {
    private Singleton4(){}

    private static final class SingletonHandler{
        private static final Singleton4 instance = new Singleton4();
    }

    public static Singleton4 getInstance(){
        return SingletonHandler.instance;
    }
}
