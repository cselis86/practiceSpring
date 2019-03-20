package com.elis.spring.practice.config;

import com.elis.spring.practice.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    @Bean
    public HelloWorldFactory helloWorldFactory(){
        return new HelloWorldFactory();
    }

    @Bean
    @Profile("default")
    public HelloService helloServiceEng(HelloWorldFactory factory){
        return factory.createHelloService("en");
    }

    @Bean
    @Profile("spanish")
    public HelloService helloServiceSpn(HelloWorldFactory factory){
        return factory.createHelloService("sp");
    }

    @Bean
    @Profile("french")
    public HelloService helloServiceFr(HelloWorldFactory factory){
        return factory.createHelloService("fr");
    }
}
