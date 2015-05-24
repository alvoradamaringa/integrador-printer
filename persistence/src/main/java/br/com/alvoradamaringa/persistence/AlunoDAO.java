package br.com.alvoradamaringa.persistence;

import java.util.List;

import br.com.alvoradamaringa.domain.Aluno;

public interface AlunoDAO extends GenericDAO<Long, Aluno> {

	public List<Aluno> consultar(String nomeAluno, String ra);
	
}
