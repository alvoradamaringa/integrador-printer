package br.com.alvoradamaringa.persistence;

import java.util.List;

import javax.ejb.Local;

import br.com.alvoradamaringa.domain.NivelUsuario;
import br.com.alvoradamaringa.domain.Usuario;

@Local
public interface UsuarioDAO extends GenericDAO<Long, Usuario> {

	Usuario consultar(String usuario, String senha);
	List<Usuario> consultarUsuario(String nome, NivelUsuario nivelUsuario);
	
}
