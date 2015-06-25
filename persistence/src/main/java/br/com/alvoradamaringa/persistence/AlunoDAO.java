package br.com.alvoradamaringa.persistence;

import java.util.List;

import javax.ejb.Local;

import br.com.alvoradamaringa.domain.Aluno;

@Local
public interface AlunoDAO extends GenericDAO<Long, Aluno> {

	public List<Aluno> consultar(String nomeAluno, String ra, String cpf);
	
	
	public Aluno consultarRa(String ra);
	
	
	
}
