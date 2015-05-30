package br.com.alvoradamaringa.web;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.alvoradamaringa.domain.Login;

@ViewScoped
@ManagedBean
public class LoginManagedBean implements Serializable {

	private static final long serialVersionUID = 23L;
	private Login login = new Login();
	
	public void efetuarLogin() {
		System.out.println("Efetuando login...");
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

}
