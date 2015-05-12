package br.com.alvoradamaringa.persistence;

import br.com.alvoradamaringa.domain;

public interface AlunoDAO extends GenericDAO<Long, Aluno> {

    public void consultarAluno();

}
