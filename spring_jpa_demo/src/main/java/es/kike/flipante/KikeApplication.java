package es.kike.flipante;

import es.kike.flipante.data.entity.CarEntity;
import es.kike.flipante.service.CarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class KikeApplication implements CommandLineRunner {
    private static Logger logger = LoggerFactory.getLogger(KikeApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(KikeApplication.class, args);
    }

    @Autowired
    private CarService service;

    @Override
    public void run(String... args) {
        logger.info("Recuperando datos de coches");

        service.findAll().stream().forEach(e -> logger.info(e.getPlate()));
        service.save(new CarEntity());
    }
}