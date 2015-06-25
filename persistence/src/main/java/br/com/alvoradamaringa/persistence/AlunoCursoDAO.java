package br.com.alvoradamaringa.persistence;

import java.util.List;

import javax.ejb.Local;

import br.com.alvoradamaringa.domain.AlunoCurso;

@Local
public interface AlunoCursoDAO extends GenericDAO<Long, AlunoCurso> {

	public List<AlunoCurso> consultar(String nomeAluno, String nomeCurso);
}
