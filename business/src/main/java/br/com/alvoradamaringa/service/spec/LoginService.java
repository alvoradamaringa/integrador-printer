package br.com.alvoradamaringa.service.spec;

import br.com.alvoradamaringa.domain.Usuario;
import br.com.alvoradamaringa.service.exceptions.LoginInvalidoException;

public interface LoginService {

	Usuario efetuarLogin(String usuario, String senha) throws LoginInvalidoException;
	
}
