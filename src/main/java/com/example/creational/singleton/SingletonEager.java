package com.example.creational.singleton;

// The instance is created at the time the class is loaded into JVM

public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {};

    public static SingletonEager getInstance(){
        return instance;
    }
}
