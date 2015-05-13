package br.com.alvoradamaringa.persistence;

import br.com.alvoradamaringa.domain;

public class BancaProfessorDAOImpl extends GenericDAOImpl<Long, BancaProfessor> implements BancaProfessorDAO {
  
    @Override
+   public List<BancaProfessor> consultar(String nomeAluno, String nomeProfessor) {
      return null;
    }
}
