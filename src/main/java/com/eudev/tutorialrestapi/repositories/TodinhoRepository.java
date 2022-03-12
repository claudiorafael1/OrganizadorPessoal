package com.eudev.tutorialrestapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.eudev.tutorialrestapi.domain.Todo;

@Repository
public interface TodinhoRepository  extends JpaRepository<Todo, Integer>{

	
	@Query("SELECT obj FROM Todo obj WHERE obj.finalizacao = false ORDER BY obj.dataParaFinalizar")
	List<Todo> findAllOpen();
	
	@Query("SELECT obj FROM Todo obj WHERE obj.finalizacao = true ORDER BY obj.dataParaFinalizar")
	List<Todo> findAllClose();
	
	
}
