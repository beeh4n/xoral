package com.example.xoral;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {

    @GetMapping("/")
    public Mono<String> welcomeMethod(){
        return Mono.just("Welcome avi!");
    }
}
