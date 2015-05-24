package br.com.alvoradamaringa.persistence;

import java.util.List;

import br.com.alvoradamaringa.domain.ProfessorCurso;

public interface ProfessorCursoDAO extends GenericDAO<Long, ProfessorCurso> {

	public List<ProfessorCurso> consultar(String nomeProfessor, String nomeCurso);
	
}
