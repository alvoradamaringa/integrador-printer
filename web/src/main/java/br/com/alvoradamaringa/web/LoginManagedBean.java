package br.com.alvoradamaringa.web;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.alvoradamaringa.domain.Login;
import br.com.alvoradamaringa.service.exceptions.LoginInvalidoException;
import br.com.alvoradamaringa.service.spec.LoginService;

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
			FacesUtils.redirect("/secure/index.xhtml");
		} catch (LoginInvalidoException ex) {
			FacesUtils.redirect("index.xhtml");
		}
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

}
