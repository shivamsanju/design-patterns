package com.example.creational.singleton;

/*
- In this the instance is not created at start. It is only created when the getInstance() method is called.
- This has a drawback too, In case of multithreading, if two threads call this method at the same time,
both may see instance as null and create a new instance. 
- To solve this we have a thread safe version.
 */

 
public class SingletonLazyLoader {
    private static SingletonLazyLoader instance;

    private SingletonLazyLoader() {};

    public static SingletonLazyLoader getInstance() {
        if (instance == null){
            instance = new SingletonLazyLoader();
        }   
        return instance;
    }
}
