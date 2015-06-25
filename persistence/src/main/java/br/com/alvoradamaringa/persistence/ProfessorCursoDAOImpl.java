package br.com.alvoradamaringa.persistence;

import java.util.List;

import javax.ejb.Stateless;

import br.com.alvoradamaringa.domain.ProfessorCurso;

@Stateless
public class ProfessorCursoDAOImpl extends GenericDAOImpl<Long, ProfessorCurso>
		implements ProfessorCursoDAO {

	public List<ProfessorCurso> consultar(String nomeProfessor, String nomeCurso) {
		return null;
	}

}
