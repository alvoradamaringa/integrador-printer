package br.com.alvoradamaringa.persistence;

import javax.ejb.Local;

import br.com.alvoradamaringa.domain.Usuario;

@Local
public interface UsuarioDAO extends GenericDAO<Long, Usuario> {

	Usuario consultar(String usuario, String senha);
	
}
