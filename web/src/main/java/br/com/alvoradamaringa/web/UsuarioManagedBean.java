package br.com.alvoradamaringa.web;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.alvoradamaringa.domain.Usuario;

@ViewScoped
@ManagedBean
public class UsuarioManagedBean implements Serializable {

	private static final long serialVersionUID = 23L;
	private Usuario usuario;
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void CadastrarUsuario(){
		System.out.println("Cadastrando Usuario");
	}
	
	public List<Usuario> getUsuarios(){
		return null;
	}
}
