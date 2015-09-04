package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Larry on 2015/9/2.
 * Building a RESTful Web Service
 * This guide walks you through the process of creating a "hello world" RESTful web service with Spring.
 */
@SpringBootApplication
public class Application{

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}