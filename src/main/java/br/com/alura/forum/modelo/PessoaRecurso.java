package br.com.alura.forum.modelo;

import java.time.LocalDateTime;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;import javax.persistence.ManyToOne;


@Entity
public class PessoaRecurso {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDateTime dataCriacao = LocalDateTime.now();
	@ManyToOne
	private Pessoa pessoaid;
	@ManyToOne
	private Recursos recursoid;
	
	public PessoaRecurso() {

	
	}

	public PessoaRecurso(Pessoa pessoaid, Recursos recursoid) {
		this.pessoaid = pessoaid;
		this.recursoid = recursoid;
	
	}
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}


	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}


	public Pessoa getPessoaid() {
		return pessoaid;
	}


	public void setPessoaid(Pessoa pessoaid) {
		this.pessoaid = pessoaid;
	}


	public Recursos getRecursoid() {
		return recursoid;
	}


	public void setRecursoid(Recursos recursoid) {
		this.recursoid = recursoid;
	}

	

}
