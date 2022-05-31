package es.kike.flipante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class KikeApplication {

    public static void main(String[] args) {
        SpringApplication.run(KikeApplication.class, args);
    }

}