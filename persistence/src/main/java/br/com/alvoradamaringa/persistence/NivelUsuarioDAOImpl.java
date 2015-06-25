package br.com.alvoradamaringa.persistence;

import javax.ejb.Stateless;

import br.com.alvoradamaringa.domain.NivelUsuario;

@Stateless
public class NivelUsuarioDAOImpl extends GenericDAOImpl<Long, NivelUsuario> implements NivelUsuarioDAO {

}
