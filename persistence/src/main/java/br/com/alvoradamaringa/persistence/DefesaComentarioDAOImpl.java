package br.com.alvoradamaringa.persistence;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;

import br.com.alvoradamaringa.domain.DefesaComentario;

@Stateless
public class DefesaComentarioDAOImpl extends GenericDAOImpl<Long, DefesaComentario> implements DefesaComentarioDAO {

    @Override
	public List<DefesaComentario> consultar(String nomeProfessor,
			String nomeCurso, String nomeAluno, Date dataApresentacao,
			String temaTcc) {
		return null;
	}

}
