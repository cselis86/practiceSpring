package com.elis.spring.practice.controllers;

import com.elis.spring.practice.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    private HelloService helloService;

    @Autowired
    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    public String sayHello(){

        String greeting = helloService.getGreeting();

        System.out.println(greeting);

        return greeting;
    }
}
