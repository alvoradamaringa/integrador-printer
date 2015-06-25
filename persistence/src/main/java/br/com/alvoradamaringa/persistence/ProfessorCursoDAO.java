package br.com.alvoradamaringa.persistence;

import java.util.List;

import javax.ejb.Local;

import br.com.alvoradamaringa.domain.ProfessorCurso;

@Local
public interface ProfessorCursoDAO extends GenericDAO<Long, ProfessorCurso> {

	public List<ProfessorCurso> consultar(String nomeProfessor, String nomeCurso);
	
}
