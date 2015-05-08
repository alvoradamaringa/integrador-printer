package br.com.alvoradamaringa.domain;

public class DefesaComentario extends DefesaComentarioDAOImpl {

    private Long idDefesaComentario;
    private String comentario;

    public void adicionarComentario(String comentario) {
        this.comentario = comentario;
    }

}
