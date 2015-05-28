package br.com.alvoradamaringa.bussiness;

import java.awt.List;
import java.sql.Date;

public interface DefesaService {

    public void cadastraDefesa(DefesaAluno DefesaAluno);

    public List<DefesaAluno> consultaDefesa(Integer idDefesaAluno, Date data, String tema);

    public void excluiDefesa(DefesaAluno DefesaAluno);

    public void cadastraDefesa(DefesaComentario DefesaComentario);

    public list<DefesaCometario> consultaDefesa(String comentario);

    public void excluiDefesa(DefesaComentario DefesaComentario);

}
