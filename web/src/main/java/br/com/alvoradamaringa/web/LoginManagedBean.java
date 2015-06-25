package br.com.alvoradamaringa.web;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.alvoradamaringa.domain.Login;
import br.com.alvoradamaringa.service.exceptions.LoginInvalidoException;
import br.com.alvoradamaringa.service.spec.LoginService;
import br.com.alvoradamaringa.web.util.FacesUtils;

@ViewScoped
@ManagedBean
public class LoginManagedBean implements Serializable {

	private static final long serialVersionUID = 23L;
	private Login login = new Login();
	
	@EJB
	private LoginService loginService;
	
	public void efetuarLogin() {
		try {
			loginService.efetuarLogin(login.getUsuario(), login.getSenha());
			FacesUtils.redirect("/home.xhtml");
		} catch (LoginInvalidoException ex) {
			FacesUtils.adicionarMensagemErro("growl", "Usuário e/ou senha errado(s).");
		} catch (Exception ex) {
			FacesUtils.adicionarMensagemErro("growl", "Erro ao efetuar login. Por favor entre em contato com o administrador.");
		}
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

}
