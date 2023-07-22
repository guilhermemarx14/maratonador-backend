package com.guilhermemarx14.maratonadorbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MaratonadorBackendApplication {

	public static void main(final String[] args) {
		SpringApplication.run(MaratonadorBackendApplication.class, args);
	}

}
