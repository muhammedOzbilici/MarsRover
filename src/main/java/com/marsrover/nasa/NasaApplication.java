package com.marsrover.nasa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NasaApplication implements CommandLineRunner {

    private static Logger LOG = LoggerFactory.getLogger(NasaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(NasaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("Executing Nasa Commands ...");


    }
}
