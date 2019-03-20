package com.elis.spring.practice.config;

import com.elis.spring.practice.services.HelloService;
import com.elis.spring.practice.services.HelloServiceEngImpl;
import com.elis.spring.practice.services.HelloServiceSpnImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    @Bean
    @Profile("default")
    public HelloService helloServiceEng(){
        return new HelloServiceEngImpl();
    }

    @Bean
    @Profile("spanish")
    public HelloService helloServiceSpn(){
        return new HelloServiceSpnImpl();
    }
}
