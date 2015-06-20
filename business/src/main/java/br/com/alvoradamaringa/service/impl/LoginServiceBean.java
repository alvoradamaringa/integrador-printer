package br.com.alvoradamaringa.service.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.alvoradamaringa.domain.Usuario;
import br.com.alvoradamaringa.persistence.UsuarioDAO;
import br.com.alvoradamaringa.service.exceptions.LoginInvalidoException;
import br.com.alvoradamaringa.service.spec.LoginService;

@Stateless
public class LoginServiceBean implements LoginService {

	@EJB
	private UsuarioDAO usuarioDAO;

	@Override
	public Usuario efetuarLogin(String usuario, String senha)
			throws LoginInvalidoException {
		Usuario usuarioAutenticado = usuarioDAO.consultar(usuario, senha);

		if (usuarioAutenticado == null) {
			throw new LoginInvalidoException();
		}
		
		return usuarioAutenticado;
	}

}
