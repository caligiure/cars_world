package com.giu.cars_network;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CarsNetworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarsNetworkApplication.class, args);
	}

}
