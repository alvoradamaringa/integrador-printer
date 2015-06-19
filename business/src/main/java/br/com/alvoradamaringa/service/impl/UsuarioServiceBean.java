package br.com.alvoradamaringa.service.impl;

import java.util.List;

import javax.ejb.Stateless;

import br.com.alvoradamaringa.domain.NivelUsuario;
import br.com.alvoradamaringa.domain.Usuario;
import br.com.alvoradamaringa.service.exceptions.IntegridadeException;
import br.com.alvoradamaringa.service.spec.UsuarioService;

@Stateless
public class UsuarioServiceBean implements UsuarioService {

	@Override
	public List<Usuario> consultarUsuario(String nome, NivelUsuario nivelUsuario) {
		return null;
	}

	@Override
	public void salvarUsuario(Usuario usuario) {

	}

	@Override
	public void excluirUsuario(Usuario usuario) throws IntegridadeException {

	}

}
