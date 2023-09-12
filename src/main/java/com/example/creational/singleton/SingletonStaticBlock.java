package com.example.creational.singleton;


// This is same as singleton eager. The instance is created when class is loaded into JVM. 
// The difference is that static block allows for exception handling

public class SingletonStaticBlock {
    private static SingletonStaticBlock instance;

    static {
        instance = new SingletonStaticBlock();
    }

    private SingletonStaticBlock() {};

    public static SingletonStaticBlock getInstance(){
        return instance;
    }
}
