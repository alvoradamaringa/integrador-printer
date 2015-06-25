package br.com.alvoradamaringa.persistence;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import br.com.alvoradamaringa.domain.DefesaComentario;

@Local
public interface DefesaComentarioDAO extends GenericDAO<Long, DefesaComentario> {

	public List<DefesaComentario> consultar(String nomeProfessor, String nomeCurso,
			String nomeAluno, Date dataApresentacao, String temaTcc);

}
