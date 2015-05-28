package br.com.alvoradamaringa.service.spec;

import java.util.Date;
import java.util.List;

import br.com.alvoradamaringa.domain.DefesaAluno;
import br.com.alvoradamaringa.domain.DefesaComentario;

public interface DefesaService {

    public void cadastraDefesa(DefesaAluno DefesaAluno);

    public List<DefesaAluno> consultaDefesa(Date data, String tema, String nomeAluno);

    public void excluirDefesa(DefesaAluno DefesaAluno);

    public void cadastrarDefesa(DefesaComentario DefesaComentario);

    public List<DefesaComentario> consultarDefesa(String comentario);

    public void excluirDefesa(DefesaComentario DefesaComentario);

}
