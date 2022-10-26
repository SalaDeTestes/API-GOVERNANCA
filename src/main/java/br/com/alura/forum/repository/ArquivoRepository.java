package br.com.alura.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.PessoaRecurso;

public interface ArquivoRepository  extends JpaRepository<PessoaRecurso, Long> {

}
