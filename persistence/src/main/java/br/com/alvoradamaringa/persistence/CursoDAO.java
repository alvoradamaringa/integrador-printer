package br.com.alvoradamaringa.persistence;

import br.com.alvoradamaringa.domain;

public interface CursoDAO extends GenericDAO<Long, Curso> {
  public List<Curso> consultar(Long, idCurso, String descricao);

}
