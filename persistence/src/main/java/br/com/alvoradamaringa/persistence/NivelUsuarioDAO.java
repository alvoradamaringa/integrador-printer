package br.com.alvoradamaringa.persistence;

import javax.ejb.Local;

import br.com.alvoradamaringa.domain.NivelUsuario;

@Local
public interface NivelUsuarioDAO extends GenericDAO<Long, NivelUsuario> {

}
