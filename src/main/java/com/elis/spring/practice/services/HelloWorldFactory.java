package com.elis.spring.practice.services;

public class HelloWorldFactory {

    public HelloService createHelloService(String lang){

        HelloService service = null;

        switch (lang){
            case "en":
                service = new HelloServiceEngImpl();
                break;
            case "sp":
                service = new HelloServiceSpnImpl();
                break;
            case "fr":
                service = new HelloServiceFrImpl();
                break;
            default: new HelloServiceEngImpl();
        }
        return service;
    }
}
