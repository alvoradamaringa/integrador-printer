package br.com.alvoradamaringa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PESQUISA_TIPO_TCC")
public class PesquisaTipoTcc  implements Serializable {
	
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

}
