package br.com.alvoradamaringa.persistence;

import br.com.alvoradamaringa.domain.Usuario;

public interface UsuarioDAO extends GenericDAO<Long, Usuario> {

	public Usuario consultar(String login, String nome);
	
}
