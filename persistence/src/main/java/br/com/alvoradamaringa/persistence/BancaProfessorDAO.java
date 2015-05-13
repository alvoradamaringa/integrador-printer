package br.com.alvoradamaringa.persistence;

import br.com.alvoradamaringa.domain;

public interface BancaProfessorDAO extends GenericDAO<Long, BancaProfessor>{
  
   public List<BancaProfessor> consultar(String nomeAluno, String nomeProfessor);

}
