package br.com.alvoradamaringa.persistence;

import java.util.List;

import javax.ejb.Stateless;

import br.com.alvoradamaringa.domain.Curso;

@Stateless
public class CursoDAOImpl extends GenericDAOImpl<Long, Curso> implements CursoDAO {

	public List<Curso> consultar(String descricao) {
		return null;
	}
}
