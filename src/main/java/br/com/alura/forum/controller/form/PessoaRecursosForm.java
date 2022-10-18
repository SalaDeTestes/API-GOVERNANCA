package br.com.alura.forum.controller.form;




import br.com.alura.forum.modelo.Pessoa;
import br.com.alura.forum.modelo.PessoaRecurso;
import br.com.alura.forum.modelo.Recursos;
import br.com.alura.forum.repository.PessoaRepository;
import br.com.alura.forum.repository.RecursosRepository;


public class PessoaRecursosForm {

	
	
	private Long pessoaid;
	private Long recursoid;
	
	
	
	public Long getPessoaid() {
		return pessoaid;
	}



	public void setPessoaid(Long pessoaid) {
		this.pessoaid = pessoaid;
	}



	public Long getRecursoid() {
		return recursoid;
	}



	public void setRecursoid(Long recursoid) {
		this.recursoid = recursoid;
	}



	public PessoaRecurso converter(PessoaRepository pessoaRepository, RecursosRepository recursoRepository){
		Pessoa pessoa = pessoaRepository.getReferenceById(pessoaid);
		Recursos recurso = recursoRepository.getReferenceById(recursoid);
		
		
		return new PessoaRecurso(pessoa, recurso);
		
		
	}

}
