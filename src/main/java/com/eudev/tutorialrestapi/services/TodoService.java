package com.eudev.tutorialrestapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eudev.tutorialrestapi.domain.Todo;
import com.eudev.tutorialrestapi.repositories.TodinhoRepository;
import com.eudev.tutorialrestapi.services.exceptions.ObjectNotFoundException;

@Service
public class TodoService {


	@Autowired
	private TodinhoRepository todinhoRepository;
/*faça a busca de um objeto pelo id, se encontrar retorne,
se não ta tudo bem, so avisa*/ 

public Todo findById(Integer id) {
	Optional<Todo> obj= todinhoRepository.findById(id);
		
	return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado! Id:"+id+",Tipo:"+Todo.class.getName()));
	}

public List<Todo> findAllOpen() {
	List<Todo>  list= todinhoRepository.findAllOpen();
	return list;
}
public List<Todo> findAllClose() {
	List<Todo>  list= todinhoRepository.findAllClose();
	return list;
}

public List<Todo> findAll() {
	List<Todo>  list= todinhoRepository.findAll();
	return list;
}

public Todo create(Todo obj) {
	obj.setId(null);
	return todinhoRepository.save(obj);
	
}

public void delete(Integer id) {
	todinhoRepository.deleteById(id);	
}

public Todo update(Integer id, Todo obj) {
	Todo  newObj=findById(id);
	newObj.setTitulo(obj.getTitulo());
	newObj.setDataParaFinalizar(obj.getDataParaFinalizar());
	newObj.setDescricao(obj.getDescricao());
	newObj.setFinalizacao(obj.getFinalizacao());
	return todinhoRepository.save(newObj);
	
	
}

}
