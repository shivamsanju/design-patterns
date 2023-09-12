package com.example.creational.factory;

public class DatabaseFactory implements AbstractFactory{
    
    @Override
    public Service createService(){
        return new DatabaseService();
    }

    @Override
    public Response createResponse() {
        return new DatabaseResponse();
    }
}
