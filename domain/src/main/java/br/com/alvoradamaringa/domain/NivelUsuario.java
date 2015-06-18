package br.com.alvoradamaringa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NIVELUSUARIO")
public class NivelUsuario  implements Serializable {
	
	private static final long serialVersionUID = 23L;
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
