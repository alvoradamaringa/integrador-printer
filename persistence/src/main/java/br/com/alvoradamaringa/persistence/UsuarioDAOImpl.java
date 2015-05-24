package br.com.alvoradamaringa.persistence;

import java.util.List;

import br.com.alvoradamaringa.domain.Usuario;

public class UsuarioDAOImpl extends GenericDAOImpl<Long, Usuario> implements UsuarioDAO {
  
	public List<Usuario> consultar(String login, String nome) {
		return null;
	}
	
}
