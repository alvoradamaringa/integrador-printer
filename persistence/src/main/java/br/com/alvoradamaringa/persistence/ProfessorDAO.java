package br.com.alvoradamaringa.persistence;

import java.util.List;

import br.com.alvoradamaringa.domain.Professor;

public interface ProfessorDAO extends GenericDAO<Long, Professor> {

	public List<Professor> consultar(String nomeProfessor, String cpf);
	
}

