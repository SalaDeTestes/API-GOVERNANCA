package br.com.alura.forum.controller.form;

	import javax.validation.constraints.NotEmpty;
	import javax.validation.constraints.NotNull;

	import br.com.alura.forum.modelo.Pessoa;
import br.com.alura.forum.modelo.Recursos;
import br.com.alura.forum.repository.PessoaRepository;
import br.com.alura.forum.repository.RecursosRepository;

	public class AtualizacaoPessoasForm {
		
		@NotNull @NotEmpty
		private String nome;
		@NotNull @NotEmpty
		private String cargo;
		private String cidade;
		private String lider;
		@NotNull @NotEmpty
		private String empresa;
		@NotNull @NotEmpty
		private String email;
		private String senha;
		
			
			
		
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
		
		public Pessoa atualizar(Long id, PessoaRepository pessoaRepository) {
			Pessoa pessoas = pessoaRepository.getOne(id);
			pessoas.setNome(nome);
			pessoas.setCargo(cargo);
			pessoas.setCidade(cidade);
			pessoas.setLider(lider);
			pessoas.setEmpresa(empresa);
			pessoas.setEmail(email);
			pessoas.setSenha(senha);
			
			
			return pessoas;
		}

	
		

	}


