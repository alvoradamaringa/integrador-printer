package br.com.alvoradamaringa.domain;

public class NivelUsuario {

	@Id
	@GeneratedValue
	@Column(name = "id_nivel_usuario")
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
