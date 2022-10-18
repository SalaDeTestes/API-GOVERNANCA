package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.Pessoa;
import br.com.alura.forum.modelo.PessoaRecurso;
import br.com.alura.forum.modelo.Recursos;

public class PessoaRecursosDto {

	private Long id;
	private LocalDateTime dataCriacao;
	private Pessoa pessoaid;
	private Recursos recursoid;
	
	public PessoaRecursosDto(PessoaRecurso precursos) {	
		this.id = precursos.getId() != null ? precursos.getId():null; //codigo do leandro do esclamação para frente, serve para tratar campo null no banco de dados;
		this.dataCriacao = precursos.getDataCriacao();
		this.pessoaid = precursos.getPessoaid();
		this.recursoid = precursos.getRecursoid();
	}
	
	public Long getId() {
		return id;
	}

	
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}
	
	

	public Pessoa getPessoaid() {
		return pessoaid;
	}

	public Recursos getRecursoid() {
		return recursoid;
	}

	public static List<PessoaRecursosDto> converter(List<PessoaRecurso> precursos) {
		
		return precursos.stream().map(PessoaRecursosDto::new).collect(Collectors.toList());
	}
	
	
}
