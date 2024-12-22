package com.emp.backend;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
//		Dotenv dotenv = Dotenv.load();
//		System.setProperty("MONGODB_URI", dotenv.get("MONGODB_URI"));
//		System.setProperty("DATABASE_NAME", dotenv.get("DATABASE_NAME"));
		SpringApplication.run(BackendApplication.class, args);
	}

}
