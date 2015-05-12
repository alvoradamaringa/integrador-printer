package br.com.alvoradamaringa.domain;

public class Usuario {

	private Long idUsuario;
	private NivelUsuario nivelUsuario;
	private String login;
	private String senha;

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Long getIdUsuario() {
		return this.idUsuario;
	}

	public void setNivelUsuario(NivelUsuario nivelUsuario) {
		this.nivelUsuario = nivelUsuario;
	}

	public NivelUsuario getNivelUsuario() {
		return this.nivelUsuario;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getLogin() {
		return this.login;
	}

	public void setSenha(String login) {
		this.login = login;
	}

	public String getSenha() {
		return this.senha;
	}
}
