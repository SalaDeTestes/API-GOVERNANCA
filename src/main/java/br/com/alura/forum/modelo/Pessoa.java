package br.com.alura.forum.modelo;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cargo;
	private String contato;
	private String cidade;
	private String lider;
	private String empresa;
	private String email;
	private String senha;
	private LocalDateTime dataCriacao = LocalDateTime.now();
	
	
	public Pessoa() {
		
	}
	
	
	public Pessoa(Long id, String nome, String cargo, String telefone, String cidade, String lider, String empresa, String email, String senha) {

		this.nome = nome;
		this.cargo = cargo;
		this.contato = telefone;
		this.cidade = cidade;
		this.lider = lider;
		this.empresa = empresa;
		this.email = email;
		this.senha = senha;
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
	public String getTelefone() {
		return contato;
	}
	public void setTelefone(String telefone) {
		this.contato = telefone;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
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


	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}


	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
	
	
	

}
