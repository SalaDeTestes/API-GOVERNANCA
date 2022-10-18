package br.com.alura.forum.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;


import br.com.alura.forum.modelo.PessoaRecurso;


public interface PessoaRecursosRepository extends JpaRepository<PessoaRecurso, Long> {
	
	List<PessoaRecurso> findByPessoaid_Nome(String nome);
	List<PessoaRecurso> findByRecursoid_Tag(String tag);	
}
