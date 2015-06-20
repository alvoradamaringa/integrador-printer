package br.com.alvoradamaringa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "USUARIO")
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 23L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_USUARIO")
	private Long idUsuario;
	@ManyToOne
	@JoinColumn(name = "ID_NIVEL_USUARIO")
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
