package hello;

/**
 * Created by Larry on 2015/9/2.
 * Building a RESTful Web Service
 * This guide walks you through the process of creating a "hello world" RESTful web service with Spring.
 */
//@SpringBootApplication
//public class Application{
//
//    public static void main(String[] args){
//        SpringApplication.run(Application.class, args);
//    }
//}


import consume.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Larry on 2015/9/2.
 * Consuming a RESTful Web Service
 * You’ll build an application that uses Spring’s RestTemplate to retrieve a random Spring Boot quotation at http://gturnquist-quoters.cfapps.io/api/random.
 */
@SpringBootApplication
public class Application implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info(quote.toString());
    }
}