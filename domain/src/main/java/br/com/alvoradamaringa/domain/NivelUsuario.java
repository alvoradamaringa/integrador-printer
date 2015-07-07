package br.com.alvoradamaringa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NIVELUSUARIO")
public class NivelUsuario  implements Serializable {
	
	private static final long serialVersionUID = 23L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result
				+ ((idNivelUsuario == null) ? 0 : idNivelUsuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NivelUsuario other = (NivelUsuario) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (idNivelUsuario == null) {
			if (other.idNivelUsuario != null)
				return false;
		} else if (!idNivelUsuario.equals(other.idNivelUsuario))
			return false;
		return true;
	}

}
