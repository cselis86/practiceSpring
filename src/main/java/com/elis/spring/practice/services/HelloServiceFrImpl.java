package com.elis.spring.practice.services;

public class HelloServiceFrImpl implements HelloService {
    @Override
    public String getGreeting() {
        return "Allo Spring ";
    }
}
