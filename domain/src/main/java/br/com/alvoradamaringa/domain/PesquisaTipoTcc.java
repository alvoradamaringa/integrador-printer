package br.com.alvoradamaringa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PESQUISATIPOTCC")
public class PesquisaTipoTcc implements Serializable {

	private static final long serialVersionUID = 23L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PESQUISA_TIPO_TCC")
	private Long idPesquisaTipoTcc;
	private String descricao;

	public Long getIdPesquisaTipoTcc() {
		return idPesquisaTipoTcc;
	}

	public void setIdPesquisaTipoTcc(Long idPesquisaTipoTcc) {
		this.idPesquisaTipoTcc = idPesquisaTipoTcc;
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
		result = prime
				* result
				+ ((idPesquisaTipoTcc == null) ? 0 : idPesquisaTipoTcc
						.hashCode());
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
		PesquisaTipoTcc other = (PesquisaTipoTcc) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (idPesquisaTipoTcc == null) {
			if (other.idPesquisaTipoTcc != null)
				return false;
		} else if (!idPesquisaTipoTcc.equals(other.idPesquisaTipoTcc))
			return false;
		return true;
	}

}
