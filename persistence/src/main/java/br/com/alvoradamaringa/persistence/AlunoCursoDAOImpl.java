package br.com.alvoradamaringa.persistence;

import java.util.List;

import javax.ejb.Stateless;

import br.com.alvoradamaringa.domain.AlunoCurso;

@Stateless
public class AlunoCursoDAOImpl extends GenericDAOImpl<Long, AlunoCurso>
		implements AlunoCursoDAO {

	public List<AlunoCurso> consultar(String nomeAluno, String nomeCurso) {
		return null;
	}

}
