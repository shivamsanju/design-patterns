package com.example.creational.singleton;

/*
- Only once point of access for a resource.
- One object is created and used across the code.

Uses:
    1. DB Connection
    2. Network COnnection
    3. Logger

Tip: The thread safe implementation is the best as it works in all cases.

 */


class MultithreadingTest extends Thread {
    public void run() {
        try {
            SingletonLazyLoader lazyInstance = SingletonLazyLoader.getInstance();              
            SingletonThreadSafe threadSafeInstance = SingletonThreadSafe.getInstance();
            System.out.println(lazyInstance);  
            System.out.println(threadSafeInstance);
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}



public class Singleton {
    public Singleton() {};

    public static void testSingletonClasses(){

        // Singleton Eager
        SingletonEager eageInstance1 = SingletonEager.getInstance();        
        SingletonEager eageInstance2 = SingletonEager.getInstance();

        System.out.println(eageInstance1);        
        System.out.println(eageInstance2);

        // Singleton Static Block
        SingletonStaticBlock sbInstance1 = SingletonStaticBlock.getInstance();        
        SingletonStaticBlock sbInstance2 = SingletonStaticBlock.getInstance();

        System.out.println(sbInstance1);        
        System.out.println(sbInstance2);

        // Singleton Lazy Loader
        SingletonLazyLoader lazyInstance1 = SingletonLazyLoader.getInstance();        
        SingletonLazyLoader lazyInstance2 = SingletonLazyLoader.getInstance();

        System.out.println(lazyInstance1);        
        System.out.println(lazyInstance2);

        // Singleton Thread Safe Lazy Loader
        SingletonThreadSafe threadSafeInstance1 = SingletonThreadSafe.getInstance();        
        SingletonThreadSafe threadSafeInstance2 = SingletonThreadSafe.getInstance();

        System.out.println(threadSafeInstance1);        
        System.out.println(threadSafeInstance2);

        // MultiThreadingTest
        for(int i=0; i<2; i++){
            MultithreadingTest testObj = new MultithreadingTest();
            testObj.start();
        }

        // Singleton Bill Pugh
        SingletonBillPugh billPughInstance1 = SingletonBillPugh.getInstance();        
        SingletonBillPugh billPughInstance2 = SingletonBillPugh.getInstance();

        System.out.println(billPughInstance1);        
        System.out.println(billPughInstance2);


    }
}
