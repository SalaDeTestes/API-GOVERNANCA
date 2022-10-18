	package br.com.alura.forum.controller.form;


import javax.validation.constraints.NotEmpty;
	import javax.validation.constraints.NotNull;

import br.com.alura.forum.modelo.Pessoa;

	public class PessoaForm {
		
		@NotNull @NotEmpty
		private String nome;
		@NotNull @NotEmpty
		private String cargo;
		private String telefone;
		@NotNull @NotEmpty
		private String cidade;
		private String lider;
		@NotNull @NotEmpty
		private String empresa;
		@NotNull @NotEmpty
		private String email;
		@NotNull @NotEmpty
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





		public String getTelefone() {
			return telefone;
		}





		public void setTelefone(String telefone) {
			this.telefone = telefone;
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





		public Pessoa formulario() {
			
			Pessoa pessoas = new Pessoa();
			pessoas.setNome(nome);
			pessoas.setLider(lider);
			pessoas.setCidade(cidade);
			pessoas.setCargo(cargo);
			pessoas.setEmpresa(empresa);
			pessoas.setTelefone(telefone);
			pessoas.setSenha(senha);
			pessoas.setEmail(email);
			
			
			return pessoas;
		}


		
	

}
