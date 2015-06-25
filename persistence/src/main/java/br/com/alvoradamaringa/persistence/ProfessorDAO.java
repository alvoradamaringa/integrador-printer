package br.com.alvoradamaringa.persistence;

import java.util.List;

import javax.ejb.Local;

import br.com.alvoradamaringa.domain.Professor;

@Local
public interface ProfessorDAO extends GenericDAO<Long, Professor> {

	public List<Professor> consultar(String nomeProfessor, String cpf);
	
	public Professor consultarCpf(String cpf);

}
