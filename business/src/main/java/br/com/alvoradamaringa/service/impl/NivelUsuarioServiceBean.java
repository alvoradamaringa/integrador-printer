package br.com.alvoradamaringa.service.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.alvoradamaringa.domain.NivelUsuario;
import br.com.alvoradamaringa.persistence.NivelUsuarioDAO;
import br.com.alvoradamaringa.service.exceptions.IntegridadeException;
import br.com.alvoradamaringa.service.spec.NivelUsuarioService;

@Stateless
public class NivelUsuarioServiceBean implements NivelUsuarioService {

	@EJB
	private NivelUsuarioDAO nivelUsuarioDAO;
	
	@Override
	public void salvarNivelUsuario(NivelUsuario NivelUsuario) {
		
	}

	@Override
	public List<NivelUsuario> consultarNivelUsuario(String descricao) {
		return nivelUsuarioDAO.consultar(descricao);
	}

	@Override
	public void excluirNivelUsuario(NivelUsuario nivelUsuario) throws IntegridadeException {
		
	}

}
