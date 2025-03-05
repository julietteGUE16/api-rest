package com.example.api_rest;

import org.springframework.boot.SpringApplication;

public class TestApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.from(ApiRestApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
