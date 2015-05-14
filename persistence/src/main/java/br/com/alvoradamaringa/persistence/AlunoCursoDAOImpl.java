package br.com.alvoradamaringa.persistence;

import br.com.alvoradamaringa.domain;

public class AlunoCursoDAOImpl extends GenericDAOImpl<Long, AlunoCurso> implements AlunoCursoDAO {
  
  public list<AlunoCurso> Consultar(String aluno,String curso,long idAlunoCurso);

}
