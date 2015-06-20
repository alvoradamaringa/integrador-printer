package br.com.alvoradamaringa.persistence;

import java.util.List;

import br.com.alvoradamaringa.domain.AlunoCurso;

public interface AlunoCursoDAO extends GenericDAO<Long, AlunoCurso> {

	public List<AlunoCurso> consultar(String nomeAluno, String nomeCurso);
}
