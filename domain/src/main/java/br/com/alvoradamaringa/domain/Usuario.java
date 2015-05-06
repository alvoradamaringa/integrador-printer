package br.com.alvoradamaringa.domain;

public class Usuario {
    private Long idUsuario;
    private IdNivelUsuario idNivelUsuario;
    private String login;
    private String senha;
	
	
	public void setIdUsuario(Long idUsuario){
		this.idUsuario = idUsuario;
	}
	
	public Integer getIdUsuario(){
		return this.idUsuario;
	}
	
	public void setIdNivelUsuario (IdNivelUsuario idNivelUsuario) {
		this.idNivelUsuario = idNivelUsuario;
	}
	
	public Integer getIdNivelUsuario(){
		return this.IdNivelUsuario;
	}
	
	public void setLogin(String login){
		this.login = login;
	}
	
	public String getLogin(){
		return this.login;
	}
	
	public void setSenha(String login){
		this.login = login;
	}
	
	public String getSenha(){
		return this.senha;
	}	
}         
