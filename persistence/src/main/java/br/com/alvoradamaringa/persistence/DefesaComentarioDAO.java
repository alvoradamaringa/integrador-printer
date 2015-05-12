package br.com.alvoradamaringa.persistence;

import br.com.alvoradamaringa.domain;
import java.util.List;

public interface DefesaComentarioDAO extends GenericDAO<Long, DefesaComentario> {

    public List<DefesaComentario> consultar(String comentario);

}
