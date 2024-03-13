package com.demo.services;

import com.demo.services.services.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServicesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ServicesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}

//	@Bean
//	CommandLineRunner init(StorageService storageService) {
//		return (args) -> {
//			storageService.deleteAll();
//			storageService.init();
//		};
//	}


}
