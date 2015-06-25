package br.com.alvoradamaringa.persistence;

import java.util.List;

import javax.ejb.Local;

import br.com.alvoradamaringa.domain.Curso;

@Local
public interface CursoDAO extends GenericDAO<Long, Curso> {
	
	public List<Curso> consultar(String descricao);

}
