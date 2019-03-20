package com.elis.spring.practice.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class HelloServiceEngImpl implements HelloService {
    @Override
    public String getGreeting() {
        return "Hello Spring ";
    }
}
