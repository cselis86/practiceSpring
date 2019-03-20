package com.elis.spring.practice.services;

public class HelloServiceEngImpl implements HelloService {
    @Override
    public String getGreeting() {
        return "Hello Spring ";
    }
}
