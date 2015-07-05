package br.com.alvoradamaringa.service.spec;

import java.util.List;

import javax.ejb.Local;

import br.com.alvoradamaringa.domain.NivelUsuario;
import br.com.alvoradamaringa.domain.Usuario;
import br.com.alvoradamaringa.service.exceptions.IntegridadeException;

@Local
public interface UsuarioService {

	public List<Usuario> consultarUsuario(String nome, NivelUsuario nivelUsuario);

	public void salvarUsuario(Usuario usuario);

	public Usuario editarUsuario(Usuario usuario);
	
	public void excluirUsuario(Usuario usuario) throws IntegridadeException;

}
