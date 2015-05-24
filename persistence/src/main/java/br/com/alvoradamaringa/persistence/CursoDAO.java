package br.com.alvoradamaringa.persistence;

import java.util.List;

import br.com.alvoradamaringa.domain.Curso;

public interface CursoDAO extends GenericDAO<Long, Curso> {
	
	public List<Curso> consultar(String descricao);

}
