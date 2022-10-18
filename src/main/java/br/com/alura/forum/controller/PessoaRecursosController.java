package br.com.alura.forum.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;


import br.com.alura.forum.controller.dto.PessoaRecursosDto;

import br.com.alura.forum.controller.form.AtualizacaoPessoaRecursoForm;
import br.com.alura.forum.controller.form.PessoaRecursosForm;
import br.com.alura.forum.modelo.PessoaRecurso;

import br.com.alura.forum.repository.PessoaRecursosRepository;
import br.com.alura.forum.repository.PessoaRepository;
import br.com.alura.forum.repository.RecursosRepository;

@RestController
@RequestMapping("/inventario")  /**/
public class PessoaRecursosController {

		@Autowired
		private PessoaRepository pessoaRepository;
		@Autowired
		private RecursosRepository recursoRepository;
		@Autowired
		private PessoaRecursosRepository precursosRepository;
		
		
		@GetMapping
		@Transactional
		public List<PessoaRecursosDto> lista(String nome,String tag) {/*String nomeCurso é o parametro passado dentro da URL, cria um filtro*/
			
			if(nome == null) {
				List<PessoaRecurso> precursos = precursosRepository.findAll();
				return PessoaRecursosDto.converter(precursos);
				
			}else {
				
				List<PessoaRecurso> precursos = precursosRepository.findByPessoaid_Nome(nome);/*Metodo criado detro de topicoRepository para busca somente um atributo de uma entidade(nesse caso especifico busca o nome dentro de uma entidade que se relaciona com topico findByCursoNome  Curso= entidade Nome = atributo de curso)*/
				return PessoaRecursosDto.converter(precursos);
			}
		}
		
			@PostMapping
			@Transactional
			public ResponseEntity<PessoaRecursosDto> cadastrar(@RequestBody @Valid PessoaRecursosForm form, UriComponentsBuilder uriBuilder ) {
				
				PessoaRecurso precursos = form.converter(pessoaRepository, recursoRepository);
				precursosRepository.save(precursos);
				
				URI uri = uriBuilder.path("/inventario/{id}").buildAndExpand(precursos.getId()).toUri();
				return ResponseEntity.created(uri).body(new PessoaRecursosDto(precursos));
			}

			
			@GetMapping("/{id}")
			@Transactional
			public ResponseEntity <PessoaRecursosDto> detalhar(@PathVariable Long id) {
				Optional <PessoaRecurso> precursos = precursosRepository.findById(id);
				if(precursos.isPresent()) {
					return ResponseEntity.ok(new PessoaRecursosDto(precursos.get()));
				}
				
				return ResponseEntity.notFound().build();
				}

			
			@PutMapping("/{id}")
			@Transactional
			public ResponseEntity<PessoaRecursosDto> atualizar(@PathVariable Long id, @RequestBody @Valid AtualizacaoPessoaRecursoForm form) {
				Optional <PessoaRecurso> optional = precursosRepository.findById(id);
				if(optional.isPresent()) {
					PessoaRecurso precursos = form.atualizar(id, precursosRepository,pessoaRepository, recursoRepository);
					return ResponseEntity.ok (new PessoaRecursosDto(precursos));
				}
				
				return ResponseEntity.notFound().build();
			}
			

				
			@DeleteMapping("/{id}")
			@Transactional
			public ResponseEntity<?> remover(@PathVariable Long id) {
				Optional <PessoaRecurso> optional = precursosRepository.findById(id);
				if(optional.isPresent()) {
					
					precursosRepository.deleteById(id);
				
				return ResponseEntity.ok ().build();
					
				}
				
				return ResponseEntity.notFound().build();
				}
}
		
//}}
