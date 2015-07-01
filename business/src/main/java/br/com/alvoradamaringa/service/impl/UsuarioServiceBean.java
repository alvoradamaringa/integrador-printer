package br.com.alvoradamaringa.service.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.alvoradamaringa.domain.NivelUsuario;
import br.com.alvoradamaringa.domain.Usuario;
import br.com.alvoradamaringa.persistence.UsuarioDAO;
import br.com.alvoradamaringa.service.exceptions.IntegridadeException;
import br.com.alvoradamaringa.service.spec.UsuarioService;

@Stateless
public class UsuarioServiceBean implements UsuarioService {

	@EJB
	private UsuarioDAO usuarioDAO;
	
	@Override
	public List<Usuario> consultarUsuario(String nome, NivelUsuario nivelUsuario) {
		return usuarioDAO.consultarUsuario(nome, nivelUsuario);
	}

	@Override
	public void salvarUsuario(Usuario usuario) {
		usuarioDAO.salvar(usuario);
	}

	@Override
	public void excluirUsuario(Usuario usuario) throws IntegridadeException {
		try {
			usuarioDAO.deletar(usuario);
		} catch (Exception ex) {
			throw new IntegridadeException();
		}
	}

}
