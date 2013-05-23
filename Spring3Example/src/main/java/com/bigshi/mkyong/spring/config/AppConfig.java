package com.bigshi.mkyong.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bigshi.mkyong.spring.hello.impl.HelloWorldImpl;

@Configuration
public class AppConfig {
	
	@Bean(name="helloBean")
    public HelloWorldImpl helloWorld() {
        return new HelloWorldImpl();
    }
}
