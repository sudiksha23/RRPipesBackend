package org.RRPipes.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   // tells springboot that this is the starting point for application
public class SpringBootMain {
    public static void main(String[] args){
        SpringApplication.run(SpringBootMain.class, args);  // calling a static starting mehod which is gonna yell spring whihc is the starting point of application and order ir to create a servelet container and start the ap in that container

    }
}
