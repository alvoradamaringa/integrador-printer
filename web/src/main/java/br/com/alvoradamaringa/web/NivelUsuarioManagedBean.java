package br.com.alvoradamaringa.web;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.alvoradamaringa.domain.NivelUsuario;

@ViewScoped
@ManagedBean
public class NivelUsuarioManagedBean implements Serializable {

	private static final long serialVersionUID = 23L;
	private NivelUsuario nivelUsuario;
	
	public NivelUsuario getNivelUsuario() {
		return nivelUsuario;
	}

	public void setNivelUsuario(NivelUsuario nivelUsuario) {
		this.nivelUsuario = nivelUsuario;
	}

	public void cadastrarNivelUsuario(){
		System.out.println("Cadastrando NivelUsuario");
	}
	
	public List<NivelUsuario> getNiveisUsuario(){
		return null;
	}
}
