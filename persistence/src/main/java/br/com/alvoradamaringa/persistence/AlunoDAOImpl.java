package br.com.alvoradamaringa.persistence;

import java.util.List;

import javax.ejb.Stateless;

import br.com.alvoradamaringa.domain.Aluno;

@Stateless
public class AlunoDAOImpl extends GenericDAOImpl<Long, Aluno> implements AlunoDAO {
	
	public List<Aluno> consultar(String nomeAluno, String ra, String cpf) {
		return null;
	}

	@Override
	public Aluno consultarRa(String ra) {
		return null;
	}

}
