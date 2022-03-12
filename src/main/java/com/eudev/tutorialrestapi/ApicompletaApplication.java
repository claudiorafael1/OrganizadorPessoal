package com.eudev.tutorialrestapi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eudev.tutorialrestapi.domain.Todo;
import com.eudev.tutorialrestapi.repositories.TodinhoRepository;

@SpringBootApplication
public class ApicompletaApplication implements CommandLineRunner {



	
	public static void main(String[] args) {
		SpringApplication.run(ApicompletaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
	
	}
	
	

}
