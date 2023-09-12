package com.example.creational.factory;

/*
- Hides design logic from client
- Seperation between use and creation

How it works:
    - Interface or abstract class that defines common functionality
    - Subclasses implement the interface
    - Factory Class that instantiates the right implementation

 */


public class Factory {

    public static void test() {
        Client client1 = new Client(new DatabaseFactory());
        client1.communicate();

        Client client2 = new Client(new NetworkFactory());
        client2.communicate();
    }

}
