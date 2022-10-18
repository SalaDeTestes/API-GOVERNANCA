package br.com.alura.forum.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

	List<Pessoa> findByNome(String nome);
	Pessoa findByCargo(String cargo);
	Pessoa getReferenceById(Long id);
	



}
