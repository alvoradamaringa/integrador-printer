package br.com.alvoradamaringa.service.spec;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import br.com.alvoradamaringa.domain.BancaProfessor;
import br.com.alvoradamaringa.domain.DefesaAluno;
import br.com.alvoradamaringa.domain.DefesaComentario;

@Local
public interface DefesaService {

	List<DefesaAluno> consultarDefesa(Date data, String tema, String nomeAluno);

	void salvarDefesa(List<BancaProfessor> bancaProfessores, DefesaAluno DefesaAluno);

    void excluirDefesa(DefesaAluno DefesaAluno);

    void adicionarComentario(DefesaComentario DefesaComentario);
    
    void excluirComentario(DefesaComentario DefesaComentario);

}
