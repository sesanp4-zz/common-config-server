package com.access.commonconfigserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CommonConfigServerApplication {
   private static final Logger logger = LoggerFactory.getLogger(CommonConfigServerApplication.class);
	public static void main(String[] args) {
		logger.info(" Starting config server ");
		SpringApplication.run(CommonConfigServerApplication.class, args);
	}

}
