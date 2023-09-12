package com.example.creational.factory;

public class NetworkFactory implements AbstractFactory {
    
    @Override
    public Service createService(){
        return new NetworkService();
    }

    @Override
    public Response createResponse() {
        return new NetworkResponse();
    }
}
