package br.com.alvoradamaringa.service.impl;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;

import br.com.alvoradamaringa.domain.BancaProfessor;
import br.com.alvoradamaringa.domain.DefesaAluno;
import br.com.alvoradamaringa.domain.DefesaComentario;
import br.com.alvoradamaringa.service.exceptions.AlunoNaoInformadoException;
import br.com.alvoradamaringa.service.exceptions.BancaException;
import br.com.alvoradamaringa.service.exceptions.IntegridadeException;
import br.com.alvoradamaringa.service.spec.DefesaService;

@Stateless
public class DefesaServiceBean implements DefesaService {

	@Override
	public List<DefesaAluno> consultarDefesa(Date data, String tema,
			String nomeAluno) {
		return null;
	}

	@Override
	public void salvarDefesa(List<BancaProfessor> bancaProfessores,
			DefesaAluno DefesaAluno) throws AlunoNaoInformadoException,
			BancaException {
		
	}

	@Override
	public void excluirDefesa(DefesaAluno DefesaAluno)
			throws IntegridadeException {
		
	}

	@Override
	public void adicionarComentario(DefesaComentario DefesaComentario) {
		
	}

	@Override
	public void excluirComentario(DefesaComentario DefesaComentario) {
		
	}

}
