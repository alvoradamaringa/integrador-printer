package br.com.alvoradamaringa.web;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.alvoradamaringa.domain.NivelUsuario;
import br.com.alvoradamaringa.domain.Usuario;
import br.com.alvoradamaringa.service.exceptions.IntegridadeException;
import br.com.alvoradamaringa.service.spec.NivelUsuarioService;
import br.com.alvoradamaringa.service.spec.UsuarioService;
import br.com.alvoradamaringa.web.util.FacesUtils;

@SessionScoped
@ManagedBean
public class UsuarioManagedBean implements Serializable {

	private static final String TELA_CONSULTA = "/usuario/ConsultaUsuario.xhtml";
	private static final String TELA_CADASTRO = "/usuario/CadastroUsuario.xhtml";
	private static final long serialVersionUID = 23L;
	private Usuario usuario = new Usuario();
	private List<Usuario> listaUsuario;
	private List<NivelUsuario> listaNivelUsuario;
	private String nome;
	private NivelUsuario nivelUsuario;

	@EJB
	private UsuarioService usuarioService;
	
	@EJB
	private NivelUsuarioService nivelUsuarioService;
	
	@PostConstruct
	public void init() {
		listaNivelUsuario = nivelUsuarioService.consultarNivelUsuario(null);
	}

	public void novoUsuario() {
		usuario = new Usuario();
		init();
		FacesUtils.redirect(TELA_CADASTRO);
	}

	public void salvarUsuario() {
		try {
			usuarioService.salvarUsuario(usuario);
			consultarUsuario();
			FacesUtils.redirect(TELA_CONSULTA);
		} catch (Exception ex) {
			FacesUtils.redirect(TELA_CADASTRO);
		}
	}

	public void editarUsuario() {
		try {
			init();
			usuario = usuarioService.editarUsuario(usuario);
			FacesUtils.redirect(TELA_CADASTRO);
		} catch (Exception ex) {
			FacesUtils.redirect(TELA_CONSULTA);
		}
	}

	public void excluirUsuario() {
		try {
			usuarioService.excluirUsuario(usuario);
			listaUsuario = usuarioService.consultarUsuario(nome, nivelUsuario);
		} catch (IntegridadeException ex) {
			FacesUtils
					.adicionarMensagemErro("Este registro já está sendo utilizado!");
		} catch (Exception ex) {
			FacesUtils
					.adicionarMensagemErro("Erro ao excluir nível de acesso, por favor entre em contato com o administrador!");
		}
	}

	public void consultarUsuario() {
		listaUsuario = usuarioService.consultarUsuario(nome, nivelUsuario);
	}

	public void menu() {
		consultarUsuario();
		FacesUtils.redirect(TELA_CONSULTA);
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario nivelUsuario) {
		this.usuario = nivelUsuario;
	}

	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}

	public String getDescricao() {
		return nome;
	}

	public void setDescricao(String descricao) {
		this.nome = descricao;
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

	public NivelUsuario getNivelUsuario() {
		return nivelUsuario;
	}

	public void setNivelUsuario(NivelUsuario nivelUsuario) {
		this.nivelUsuario = nivelUsuario;
	}

}