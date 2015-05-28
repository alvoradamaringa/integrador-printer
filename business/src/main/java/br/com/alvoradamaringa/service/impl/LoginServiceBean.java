package br.com.alvoradamaringa.service.impl;

import br.com.alvoradamaringa.domain.Usuario;
import br.com.alvoradamaringa.persistence.UsuarioDAO;
import br.com.alvoradamaringa.service.exceptions.LoginInvalidoException;
import br.com.alvoradamaringa.service.spec.LoginService;

public class LoginServiceBean implements LoginService {

	private UsuarioDAO usuarioDAO;

	@Override
	public Usuario efetuarLogin(String usuario, String senha)
			throws LoginInvalidoException {
		Usuario user = usuarioDAO.consultar(usuario, senha);

		if (user == null) {
			throw new LoginInvalidoException();
		}

		return user;
	}

}
