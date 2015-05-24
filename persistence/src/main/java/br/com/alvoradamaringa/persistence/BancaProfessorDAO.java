package br.com.alvoradamaringa.persistence;

import java.util.List;

import br.com.alvoradamaringa.domain.BancaProfessor;
import br.com.alvoradamaringa.domain.TipoProfessor;

public interface BancaProfessorDAO extends GenericDAO<Long, BancaProfessor>{
  
   public List<BancaProfessor> consultar(String nomeAluno, String nomeProfessor, TipoProfessor tipoProfessor);

}
