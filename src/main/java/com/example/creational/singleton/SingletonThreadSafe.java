package com.example.creational.singleton;

public class SingletonThreadSafe {
    private static SingletonThreadSafe instance;

    private SingletonThreadSafe() {}; // private constructor so no one can create objects

    public static SingletonThreadSafe getInstance() {
        synchronized(SingletonThreadSafe.class){
            if(instance == null){
                instance = new SingletonThreadSafe();
            }
        }
        return instance;
    }
}
