package br.com.alvoradamaringa.persistence;

import java.util.List;

import br.com.alvoradamaringa.domain.Curso;

public class CursoDAOImpl extends GenericDAOImpl<Long, Curso> implements CursoDAO {

	public List<Curso> consultar(String descricao) {
		return null;
	}
}
