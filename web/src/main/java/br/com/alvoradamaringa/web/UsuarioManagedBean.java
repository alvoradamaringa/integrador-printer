package br.com.alvoradamaringa.web;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.alvoradamaringa.domain.Usuario;
import br.com.alvoradamaringa.service.spec.UsuarioService;
import br.com.alvoradamaringa.web.util.FacesUtils;

@ViewScoped
@ManagedBean
public class UsuarioManagedBean implements Serializable {

	private static final long serialVersionUID = 23L;
	private Usuario usuario = new Usuario();
	
	@EJB
	private UsuarioService usuarioService;
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void consultarUsuario() {
		
	}

	public void cadastrarUsuario(){

		try{
			usuarioService.salvarUsuario(getUsuario());
			FacesUtils.redirect("ConsultarUsuario.xhtml");
		}//Aguardar Finalização da classe CadastrarUsuarioException
//		}catch(CadastrarUsuarioException ex){
//			FacesUtils.redirect("CadastrarUsuario.xhtml");
//		}
		catch(Exception ex){
			FacesUtils.redirect("CadastrarUsuario.xhtml");
		}
	}
	
	public List<Usuario> getUsuarios(){
		return null;
	}
}
