package org.RRPipes.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHi {
    @RequestMapping("/hi")
    public String SayHello(){
        return "Hello Spring-boot";
    }
}
