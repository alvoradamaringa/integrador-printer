package br.com.alvoradamaringa.persistence;

import br.com.alvoradamaringa.domain;
import java.util.List;

public class DefesaComentarioDAOImpl extends GenericDAOImpl<Long, DefesaComentario> implements DefesaComentarioDAO {

    @Override
	public List<DefesaComentario> consultar(String comentario,
			String professor, String curso, String aluno, Date data, String tema) {
		return null;
	}

}
