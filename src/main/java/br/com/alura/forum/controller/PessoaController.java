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

import br.com.alura.forum.controller.dto.PessoaDto;
import br.com.alura.forum.controller.form.AtualizacaoPessoasForm;
import br.com.alura.forum.controller.form.PessoaForm;
import br.com.alura.forum.modelo.Pessoa;
import br.com.alura.forum.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoas")  /**/
public class PessoaController {

		@Autowired
		private PessoaRepository pessoaRepository;
		
		
		@GetMapping
		@Transactional
		public List<PessoaDto> lista(String nome) {/*String nomeCurso é o parametro passado dentro da URL, cria um filtro*/
			
			if(nome == null) {
				List<Pessoa> pessoas = pessoaRepository.findAll();
				return PessoaDto.converter(pessoas);
				
			}else {
				
				List<Pessoa> pessoas = pessoaRepository.findByNome(nome);/*Metodo criado detro de topicoRepository para busca somente um atributo de uma entidade(nesse caso especifico busca o nome dentro de uma entidade que se relaciona com topico findByCursoNome  Curso= entidade Nome = atributo de curso)*/
				return PessoaDto.converter(pessoas);
			}
		}
			
			@PostMapping
			@Transactional
			public ResponseEntity<PessoaDto> cadastrar(@RequestBody @Valid PessoaForm form, UriComponentsBuilder uriBuilder ) {
				
				Pessoa pessoas = form.formulario();
				pessoaRepository.save(pessoas);
				
				URI uri = uriBuilder.path("/pessoas/{id}").buildAndExpand(pessoas.getId()).toUri();
				return ResponseEntity.created(uri).body(new PessoaDto(pessoas));
			}
			
			@GetMapping("/{id}")
			@Transactional
			public ResponseEntity <PessoaDto> detalhar(@PathVariable Long id) {
				Optional <Pessoa> pessoas = pessoaRepository.findById(id);
				if(pessoas.isPresent()) {
					return ResponseEntity.ok(new PessoaDto(pessoas.get()));
				}
				
				return ResponseEntity.notFound().build();
				}
			
			@PutMapping("/{id}")
			@Transactional
			public ResponseEntity<PessoaDto> atualizar(@PathVariable Long id, @RequestBody @Valid AtualizacaoPessoasForm form) {
				Optional <Pessoa> optional = pessoaRepository.findById(id);
				if(optional.isPresent()) {
					Pessoa pessoas = form.atualizar(id, pessoaRepository);
					return ResponseEntity.ok (new PessoaDto(pessoas));
				}
				
				return ResponseEntity.notFound().build();
			}
				
			@DeleteMapping("/{id}")
			@Transactional
			public ResponseEntity<?> remover(@PathVariable Long id) {
				Optional <Pessoa> optional = pessoaRepository.findById(id);
				if(optional.isPresent()) {
					
				pessoaRepository.deleteById(id);
				
				return ResponseEntity.ok ().build();
					
				}
				
				return ResponseEntity.notFound().build();
				}
				
		
}
