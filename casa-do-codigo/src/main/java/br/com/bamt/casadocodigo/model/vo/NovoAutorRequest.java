package br.com.bamt.casadocodigo.model.vo;

import javax.validation.constraints.NotBlank;

import br.com.bamt.casadocodigo.model.Autor;

public class NovoAutorRequest {
	
	@NotBlank
	private String nome;
	@NotBlank
	private String descricao;
	@NotBlank
	private String linkFoto;
	
	public NovoAutorRequest(@NotBlank String nome, @NotBlank String descricao, @NotBlank String linkFoto) {
		this.nome = nome;
		this.descricao = descricao;
		this.linkFoto = linkFoto;
	}

	public Autor toModel() {
		return new Autor(this.nome, this.descricao, this.linkFoto);
	}
}
