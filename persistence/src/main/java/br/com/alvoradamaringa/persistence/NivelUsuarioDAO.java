package br.com.alvoradamaringa.persistence;

import java.util.List;

import javax.ejb.Local;

import br.com.alvoradamaringa.domain.NivelUsuario;

@Local
public interface NivelUsuarioDAO extends GenericDAO<Long, NivelUsuario> {

	List<NivelUsuario> consultar(String descricao);

}
