package com.medium.article.devcointainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DevcointainerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevcointainerApplication.class, args);
	}

}
