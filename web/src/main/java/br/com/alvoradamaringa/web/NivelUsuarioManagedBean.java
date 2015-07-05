package br.com.alvoradamaringa.web;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.alvoradamaringa.domain.NivelUsuario;
import br.com.alvoradamaringa.service.exceptions.IntegridadeException;
import br.com.alvoradamaringa.service.spec.NivelUsuarioService;
import br.com.alvoradamaringa.web.util.FacesUtils;

@SessionScoped
@ManagedBean
public class NivelUsuarioManagedBean implements Serializable {

	private static final String TELA_CONSULTA = "/nivelusuario/ConsultaNivelUsuario.xhtml";
	private static final String TELA_CADASTRO = "/nivelusuario/CadastroNivelUsuario.xhtml";
	private static final long serialVersionUID = 23L;
	private NivelUsuario nivelUsuario = new NivelUsuario();
	private List<NivelUsuario> listaNivelUsuario;
	private String descricao;

	@EJB
	private NivelUsuarioService nivelUsuarioService;

	public void novoNivelUsuario() {
		nivelUsuario = new NivelUsuario();
		FacesUtils.redirect(TELA_CADASTRO);
	}
	
	public void salvarNivelUsuario() {
		try {
			nivelUsuarioService.salvarNivelUsuario(nivelUsuario);
			consultarNivelUsuario();
			FacesUtils.redirect(TELA_CONSULTA);
		} catch (Exception ex) {
			FacesUtils.redirect(TELA_CADASTRO);
		}
	}

	public void editarNivelUsuario() {
		try {
			nivelUsuario = nivelUsuarioService.editarNivelUsuario(nivelUsuario);
			consultarNivelUsuario();
			FacesUtils.redirect(TELA_CADASTRO);
		} catch (Exception ex) {
			FacesUtils.redirect(TELA_CONSULTA);
		}
	}

	public void excluirNivelUsuario() {
		try {
			nivelUsuarioService.excluirNivelUsuario(nivelUsuario);
			listaNivelUsuario = nivelUsuarioService.consultarNivelUsuario(descricao);
		} catch (IntegridadeException ex) {
			FacesUtils
					.adicionarMensagemErro("Este registro já está sendo utilizado!");
		} catch (Exception ex) {
			FacesUtils
					.adicionarMensagemErro("Erro ao excluir nível de acesso, por favor entre em contato com o administrador!");
		}
	}

	public void consultarNivelUsuario() {
		listaNivelUsuario = nivelUsuarioService
				.consultarNivelUsuario(descricao);
	}
	
	public void menu() {
		consultarNivelUsuario();
		FacesUtils.redirect(TELA_CONSULTA);
	}

	public NivelUsuario getNivelUsuario() {
		return nivelUsuario;
	}

	public void setNivelUsuario(NivelUsuario nivelUsuario) {
		this.nivelUsuario = nivelUsuario;
	}

	public List<NivelUsuario> getListaNivelUsuario() {
		return listaNivelUsuario;
	}

	public void setListaNivelUsuario(List<NivelUsuario> listaNivelUsuario) {
		this.listaNivelUsuario = listaNivelUsuario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}