package com.eudev.tutorialrestapi.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.eudev.tutorialrestapi.services.DBService;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
 	private DBService dbService;
	
	
	@Bean
	public boolean instancia() {
		this.dbService.instanciaBaseDeDados();
		return true;
	}

}
