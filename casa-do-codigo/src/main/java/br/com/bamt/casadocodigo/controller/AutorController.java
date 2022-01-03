package br.com.bamt.casadocodigo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bamt.casadocodigo.model.Autor;
import br.com.bamt.casadocodigo.model.repository.AutorRepository;
import br.com.bamt.casadocodigo.model.vo.NovoAutorRequest;

@RestController
@RequestMapping("autor")
public class AutorController {
	
	@Autowired
	private AutorRepository autorRepository;

	@PostMapping
	public String criaAutor(@RequestBody @Valid NovoAutorRequest request) {
		Autor autor = request.toModel();
		autorRepository.save(autor);
		return autor.toString();
	}
}
