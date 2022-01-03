package br.com.bamt.casadocodigo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Autor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private String nome;
	@NotBlank
	private String descricao;
	@NotBlank
	private String linkFoto;
	
	@Deprecated
	public Autor() {
		
	}

	public Autor(@NotBlank String nome, @NotBlank String descricao, @NotBlank String linkFoto) {
		this.nome = nome;
		this.descricao = descricao;
		this.linkFoto = linkFoto;
	}
	
	@Override
	public String toString() {
		return "nome: " + this.nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLinkFoto() {
		return linkFoto;
	}

	public void setLinkFoto(String linkFoto) {
		this.linkFoto = linkFoto;
	}
	
}
