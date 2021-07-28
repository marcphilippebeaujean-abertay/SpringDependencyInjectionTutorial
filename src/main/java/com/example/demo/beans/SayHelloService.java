package com.example.demo.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sayHelloService")
public class SayHelloService implements SaySomethingService {
    @Override
    public String saySomething() {
        return "Hello World";
    }
}
