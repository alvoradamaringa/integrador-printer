package br.com.alvoradamaringa.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class NivelUsuario {

	@Id
	@GeneratedValue
	@Column(name = "ID_NIVEL_USUARIO")
	private Long idNivelUsuario;
	private String descricao;

	public Long getIdNivelUsuario() {
		return idNivelUsuario;
	}

	public void setIdNivelUsuario(Long idNivelUsuario) {
		this.idNivelUsuario = idNivelUsuario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
