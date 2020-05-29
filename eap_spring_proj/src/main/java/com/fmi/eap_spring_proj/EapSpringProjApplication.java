package com.fmi.eap_spring_proj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class EapSpringProjApplication implements WebMvcConfigurer {

        private static final Logger logger = LoggerFactory.getLogger(EapSpringProjApplication.class);

        public static void main(String[] args) {
            SpringApplication.run(EapSpringProjApplication.class, args);
            logger.info("Application Started");
        }



    }

