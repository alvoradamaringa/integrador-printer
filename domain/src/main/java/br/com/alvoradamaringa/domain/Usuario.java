package br.com.alvoradamaringa.domain;

import javax.persistence.*;

@Entity
public class Usuario {

	@Id
	@GeneratedValue
	@Column(name = "id_usuario")
	private Long idUsuario;

	@Enumerated(EnumType.STRING)
	private NivelUsuario nivelUsuario;

	@Column(length = 45)
	private String login;

	@Column(length = 45)
	private String senha;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public NivelUsuario getNivelUsuario() {
		return nivelUsuario;
	}

	public void setNivelUsuario(NivelUsuario nivelUsuario) {
		this.nivelUsuario = nivelUsuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
