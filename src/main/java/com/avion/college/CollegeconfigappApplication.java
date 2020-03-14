package com.avion.college;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CollegeconfigappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollegeconfigappApplication.class, args);
	}

}
