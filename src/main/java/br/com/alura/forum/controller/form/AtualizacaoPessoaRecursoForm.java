
	package br.com.alura.forum.controller.form;

	import javax.validation.constraints.NotEmpty;
	import javax.validation.constraints.NotNull;

import br.com.alura.forum.modelo.Pessoa;
import br.com.alura.forum.modelo.PessoaRecurso;
import br.com.alura.forum.modelo.Recursos;
import br.com.alura.forum.repository.PessoaRecursosRepository;
import br.com.alura.forum.repository.PessoaRepository;
import br.com.alura.forum.repository.RecursosRepository;

	public class AtualizacaoPessoaRecursoForm {
		
			
			@NotNull @NotEmpty
			private String pessoaid;
			
			@NotNull @NotEmpty
			private String recursoid;
			
			
			
			public String getPessoaid() {
				return pessoaid;
			}



			public void setPessoaid(String pessoaid) {
				this.pessoaid = pessoaid;
			}



			public String getRecursoid() {
				return recursoid;
			}



			public void setRecursoid(String recursoid) {
				this.recursoid = recursoid;
			}



			public PessoaRecurso atualizar(Long id, PessoaRecursosRepository precursosRepository, PessoaRepository pessoaRepository, RecursosRepository recursoRepository) {
				PessoaRecurso precursos = precursosRepository.getOne(id);
				precursos.setPessoaid(pessoaRepository.findByCargo(pessoaid));
				precursos.setRecursoid(recursoRepository.findByMarca(recursoid));
				return precursos;
			}
			
			
	}


