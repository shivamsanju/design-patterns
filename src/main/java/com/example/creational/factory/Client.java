package com.example.creational.factory;

public class Client {
    public Service service;
    public Response response;

    public Client(AbstractFactory factory) {
        service = factory.createService();
        response = factory.createResponse();
    }

    public void communicate() {
        if(service != null && response != null){
            System.out.println(service.runService());            
            System.out.println(response.getResponse());

        }
    }
}
