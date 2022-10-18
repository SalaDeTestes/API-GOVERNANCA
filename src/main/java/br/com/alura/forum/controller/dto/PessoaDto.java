package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.Pessoa;


public class PessoaDto {

	private Long id;
	private String nome;
	private String cargo;
	private String telefone;
	private String cidade;
	private LocalDateTime dataCriacao;
	private String lider;
	private String empresa;
	private String email;
	private String senha;
	
	public PessoaDto(Pessoa pessoas) {	
		this.id = pessoas.getId();
		this.nome = pessoas.getNome();
		this.cargo = pessoas.getCargo();
		this.dataCriacao = pessoas.getDataCriacao();
		this.cidade = pessoas.getCidade();
		this.lider = pessoas.getLider();
		this.empresa = pessoas.getEmpresa();
		this.email = pessoas.getEmail();
		this.senha = pessoas.getSenha();
		this.telefone = pessoas.getTelefone();
	}
	




	public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}

	
	
	
	
	
	public String getNome() {
		return nome;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}





	public String getCargo() {
		return cargo;
	}





	public void setCargo(String cargo) {
		this.cargo = cargo;
	}




	public String getCidade() {
		return cidade;
	}





	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	


	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}





	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}





	public String getLider() {
		return lider;
	}





	public void setLider(String lider) {
		this.lider = lider;
	}





	public String getEmpresa() {
		return empresa;
	}





	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	




	public String getTelefone() {
		return telefone;
	}





	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public String getSenha() {
		return senha;
	}





	public void setSenha(String senha) {
		this.senha = senha;
	}





	public static List<PessoaDto> converter(List<Pessoa> pessoas) {
		
		return pessoas.stream().map(PessoaDto::new).collect(Collectors.toList());
	}

	
	
}
