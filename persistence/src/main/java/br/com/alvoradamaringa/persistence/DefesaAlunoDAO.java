package br.com.alvoradamaringa.persistence;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import br.com.alvoradamaringa.domain.DefesaAluno;

@Local
public interface DefesaAlunoDAO extends GenericDAO<Long, DefesaAluno> {

	public List<DefesaAluno> consultar(String nomeAluno, Date dataDefesa);
	
}
