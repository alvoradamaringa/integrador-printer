package br.com.alvoradamaringa.service.spec;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import br.com.alvoradamaringa.domain.BancaProfessor;
import br.com.alvoradamaringa.domain.DefesaAluno;
import br.com.alvoradamaringa.domain.DefesaComentario;
import br.com.alvoradamaringa.service.exceptions.AlunoNaoInformadoException;
import br.com.alvoradamaringa.service.exceptions.BancaException;
import br.com.alvoradamaringa.service.exceptions.IntegridadeException;

@Local
public interface DefesaService {

	List<DefesaAluno> consultarDefesa(Date data, String tema, String nomeAluno);

	void salvarDefesa(List<BancaProfessor> bancaProfessores, DefesaAluno DefesaAluno) throws AlunoNaoInformadoException, BancaException;

    void excluirDefesa(DefesaAluno DefesaAluno) throws IntegridadeException;

    void adicionarComentario(DefesaComentario DefesaComentario, DefesaAluno defesaAluno);
    
    void excluirComentario(DefesaComentario DefesaComentario, DefesaAluno defesaAluno);

}
