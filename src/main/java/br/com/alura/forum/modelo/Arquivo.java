package br.com.alura.forum.modelo;

import java.sql.Blob;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Arquivo {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Blob file;
	private LocalDateTime dataCriacao = LocalDateTime.now();
	
	public Arquivo(){
		
	} 
	
	public Arquivo(Blob file) {
		this.file = file;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Blob getFile() {
		return file;
	}
	public void setFile(Blob file) {
		this.file = file;
	}
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	
}

