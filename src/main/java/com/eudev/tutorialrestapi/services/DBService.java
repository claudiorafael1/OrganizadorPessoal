package com.eudev.tutorialrestapi.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eudev.tutorialrestapi.domain.Todo;
import com.eudev.tutorialrestapi.repositories.TodinhoRepository;

@Service
public class DBService {
	
	@Autowired
	private TodinhoRepository todinhoRepository;
	
	public void instanciaBaseDeDados() {
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		Todo  t1= new Todo(null, "Fumar", "Estudar Spring com Angular 11", LocalDateTime.parse("10/03/2022 10:44", formatter), false); 
		Todo  t2= new Todo(null, "Desenvolver", "Fazer web api completa",LocalDateTime.parse("10/03/2022 10:44", formatter), true); 
		Todo  t3= new Todo(null, "Descansar", "Sou adventista, é sabado",null, true); 
				
		todinhoRepository.saveAll(Arrays.asList(t1,t2,t3));
	}
}
