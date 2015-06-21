package br.com.alvoradamaringa.web;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.alvoradamaringa.domain.NivelUsuario;
import br.com.alvoradamaringa.service.spec.NivelUsuarioService;
import br.com.alvoradamaringa.web.util.FacesUtils;

@ViewScoped
@ManagedBean
public class NivelUsuarioManagedBean implements Serializable {

	private static final long serialVersionUID = 23L;
	private NivelUsuario nivelUsuario = new NivelUsuario();
	
	@EJB
	private NivelUsuarioService nivelservice;

	public void cadastrarNivel() {
		try {
			nivelservice.salvarNivelUsuario(nivelUsuario);
			FacesUtils.redirect("/nivelusuario/CadastroNivelUsuario.xhtml");
		} catch (Exception ex){
			FacesUtils.redirect("/nivelusuario/CadastroNivelUsuario.xhtml");
		}
	}	
	
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