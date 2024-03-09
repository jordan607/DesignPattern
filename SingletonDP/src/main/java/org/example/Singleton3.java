package org.example;
//Using synchronized block
public class Singleton3 {
    private static Singleton3 instance = null;

    private Singleton3(){}

    public static Singleton3 getInstance(){
        if(instance==null){                     // improves performance
            synchronized (Singleton3.class){    //thread safety
                if(instance==null)              // checks for instance is null or not
                    instance = new Singleton3();
            }
        }
        return instance;
    }
}
