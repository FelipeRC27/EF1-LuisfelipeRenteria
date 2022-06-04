package com.idat.FelipeRenteriaConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class FelipeRenteriaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FelipeRenteriaConfigServerApplication.class, args);
	}

}
