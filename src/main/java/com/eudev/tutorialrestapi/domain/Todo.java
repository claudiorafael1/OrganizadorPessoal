package com.eudev.tutorialrestapi.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Todo implements Serializable {

	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String titulo;
private String descricao;
private LocalDateTime dataParaFinalizar;
private Boolean finalizacao=false;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}

public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}


public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public Boolean getFinalizacao() {
	return finalizacao;
}
public void setFinalizacao(Boolean finalizacao) {
	this.finalizacao = finalizacao;
}
public LocalDateTime getDataParaFinalizar() {
	return dataParaFinalizar;
}
public void setDataParaFinalizar(LocalDateTime dataParaFinalizar) {
	this.dataParaFinalizar = dataParaFinalizar;
}


 public Todo() {
	 
	 super();
 }
@Override
public int hashCode() {
	return Objects.hash(id);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Todo other = (Todo) obj;
	return Objects.equals(id, other.id);
}
public Todo(Integer id, String titulo, String descricao, LocalDateTime dataParaFinalizar, Boolean finalizacao) {
	super();
	this.id = id;
	this.titulo = titulo;
	this.descricao = descricao;
	this.dataParaFinalizar = dataParaFinalizar;
	this.finalizacao = finalizacao;
}




}
