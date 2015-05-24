package br.com.alvoradamaringa.persistence;

import java.util.List;

import br.com.alvoradamaringa.domain.Usuario;

public interface UsuarioDAO extends GenericDAO<Long, Usuario> {

	public List<Usuario> consultar(String login, String nome);
	
}
