package br.com.alvoradamaringa.persistence;

import java.util.List;

import javax.ejb.Stateless;

import br.com.alvoradamaringa.domain.BancaProfessor;
import br.com.alvoradamaringa.domain.TipoProfessor;

@Stateless
public class BancaProfessorDAOImpl extends GenericDAOImpl<Long, BancaProfessor> implements BancaProfessorDAO {
  
	public List<BancaProfessor> consultar(String nomeAluno, String nomeProfessor, TipoProfessor tipoProfessor) {
		return null;
	}
}
