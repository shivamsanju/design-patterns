package com.example.creational.factory;

public interface AbstractFactory {
    Service createService();
    Response createResponse();
}
