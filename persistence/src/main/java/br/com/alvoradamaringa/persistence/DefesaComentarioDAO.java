package br.com.alvoradamaringa.persistence;

import br.com.alvoradamaringa.domain;

public interface DefesaComentarioDAO extends GenericDAO<Long, DefesaComentario> {

    public void consultar(String comentario);

}
