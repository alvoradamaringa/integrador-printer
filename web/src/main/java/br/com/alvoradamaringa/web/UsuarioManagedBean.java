package br.com.alvoradamaringa.web;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.alvoradamaringa.domain.NivelUsuario;
import br.com.alvoradamaringa.domain.Usuario;
import br.com.alvoradamaringa.service.spec.NivelUsuarioService;
import br.com.alvoradamaringa.service.spec.UsuarioService;
import br.com.alvoradamaringa.web.util.FacesUtils;

@ViewScoped
@ManagedBean
public class UsuarioManagedBean implements Serializable {

	private static final long serialVersionUID = 23L;
	private Usuario usuario = new Usuario();
	private String nome;
	private List<Usuario> listaUsuario = new ArrayList<Usuario>();
	private List<NivelUsuario> listaNivelUsuario = new ArrayList<NivelUsuario>();
	
	@EJB
	private UsuarioService usuarioService;
	
	@EJB
	private NivelUsuarioService nivelUsuarioService;
	
	@PostConstruct
	public void init() {
		listaNivelUsuario = nivelUsuarioService.consultarNivelUsuario(null); 
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void consultarUsuario() {
		listaUsuario = usuarioService.consultarUsuario(nome, null);
	}

	public void cadastrarUsuario(){
		try{
			usuarioService.salvarUsuario(usuario);
			FacesUtils.redirect("/usuario/ConsultaUsuario.xhtml");
		} catch(Exception ex){
			FacesUtils.redirect("/usuario/CadastroUsuario.xhtml");
		}
	}
	
	public List<Usuario> getUsuarios(){
		return null;
	}
	
	public List<NivelUsuario> getListaNivelUsuario() {
		return listaNivelUsuario;
	}

	public void setListaNivelUsuario(List<NivelUsuario> listaNivelUsuario) {
		this.listaNivelUsuario = listaNivelUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}
	
}
