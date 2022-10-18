package br.com.alura.forum.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import br.com.alura.forum.modelo.Recursos;

public interface RecursosRepository extends JpaRepository<Recursos, Long>{


	List<Recursos> findByTag(String tag);
	Recursos findByMarca(String marca);
	Recursos getReferenceById(Long id);
	
	
}
