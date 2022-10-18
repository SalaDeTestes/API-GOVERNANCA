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


import br.com.alura.forum.controller.dto.RecursosDto;
import br.com.alura.forum.controller.form.AtualizacaoRecursosForm;
import br.com.alura.forum.controller.form.RecursosForm;
import br.com.alura.forum.modelo.Recursos;
import br.com.alura.forum.repository.RecursosRepository;

@RestController
@RequestMapping("/recursos")  /**/
public class RecursosController {

		@Autowired
		private RecursosRepository recursosRepository;
		
		
		@GetMapping
		@Transactional
		public List<RecursosDto> lista(String tag) {/*String nomeCurso é o parametro passado dentro da URL, cria um filtro*/
			
			if(tag == null) {
				List<Recursos> recursos = recursosRepository.findAll();
				return RecursosDto.converter(recursos);
				
			}else {
				
				List<Recursos> recursos = recursosRepository.findByTag(tag);/*Metodo criado detro de topicoRepository para busca somente um atributo de uma entidade(nesse caso especifico busca o nome dentro de uma entidade que se relaciona com topico findByCursoNome  Curso= entidade Nome = atributo de curso)*/
				return RecursosDto.converter(recursos);
			}
		}
			
			@PostMapping
			@Transactional
			public ResponseEntity<RecursosDto> cadastrar(@RequestBody @Valid RecursosForm form, UriComponentsBuilder uriBuilder ) {
				
				Recursos recursos = form.formulario();
				recursosRepository.save(recursos);
				
				URI uri = uriBuilder.path("/recursos/{id}").buildAndExpand(recursos.getId()).toUri();
				return ResponseEntity.created(uri).body(new RecursosDto(recursos));
			}
			
			@GetMapping("/{id}")
			@Transactional
			public ResponseEntity <RecursosDto> detalhar(@PathVariable Long id) {
				Optional <Recursos> recursos = recursosRepository.findById(id);
				if(recursos.isPresent()) {
					return ResponseEntity.ok(new RecursosDto(recursos.get()));
				}
				
				return ResponseEntity.notFound().build();
				}
			
			@PutMapping("/{id}")
			@Transactional
			public ResponseEntity<RecursosDto> atualizar(@PathVariable Long id, @RequestBody @Valid AtualizacaoRecursosForm form) {
				Optional <Recursos> optional = recursosRepository.findById(id);
				if(optional.isPresent()) {
					Recursos recursos = form.atualizar(id, recursosRepository);
					return ResponseEntity.ok (new RecursosDto(recursos));
				}
				
				return ResponseEntity.notFound().build();
			}
				
			@DeleteMapping("/{id}")
			@Transactional
			public ResponseEntity<?> remover(@PathVariable Long id) {
				Optional <Recursos> optional = recursosRepository.findById(id);
				if(optional.isPresent()) {
					
				recursosRepository.deleteById(id);
				
				return ResponseEntity.ok ().build();
					
				}
				
				return ResponseEntity.notFound().build();
				}
				
		
}
