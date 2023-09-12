package com.example.creational.factory;

public class DatabaseService implements Service {
    
    @Override
    public String runService(){
        return "Database service running";
    }
}
