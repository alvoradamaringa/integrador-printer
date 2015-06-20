package br.com.alvoradamaringa.service.spec;

import javax.ejb.Local;

import br.com.alvoradamaringa.domain.Usuario;
import br.com.alvoradamaringa.service.exceptions.LoginInvalidoException;

@Local
public interface LoginService {

	/**
	 * Efetuar login do usuário na aplicação
	 * 
	 * @param usuario Login do Usuário
	 * @param senha Senha do Usuário
	 * @return Usuário autenticado
	 * @throws LoginInvalidoException Erro ao efetuar login (Usuário não encontrado)
	 */
	Usuario efetuarLogin(String usuario, String senha) throws LoginInvalidoException;
	
}
