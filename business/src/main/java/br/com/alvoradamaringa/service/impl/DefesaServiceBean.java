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
			String nomeAluno) throws AlunoNaoInformadoException {
			
		List<DefesaAluno> lista = defesaAlunoDAO.consultar(nomeAluno, data, tema);
		return lista;
	
		
	}

	
	@Override
	public void salvarDefesa(List<BancaProfessores> bancaProfessores,
			DefesaAluno defesaAluno) throws AlunoNaoInformadoException,
			BancaException {
		
			Aluno aluno = defesaAluno.getAluno();
		

		if (aluno == null) {
			throw new AlunoInvalidoException();
		}
		
		
		if (bancaProfessor.size() < 3){
			throw new BancaInvalidaException();
			
		}
		
		defesaAluno.adicionarBancaProfessores(bancaProfessores);
		defesaAlunoDAO.salvar(defesaAluno);

		
	}
		
	
		
	}

	@Override
	public void excluirDefesa(DefesaAluno defesaAluno)
			throws IntegridadeException {
		
		Aluno defesa = defesaAluno.getIdDefesaAluno();
		
		if (defesa == null){
			throw new IntegridadeException();
			
			
		}
	
		defesaAlunoDAO.deletar(defesaAluno);
		
		
	}

	@Override
	public void adicionarComentario(DefesaComentario DefesaComentario) {
		


	@Override
	public void excluirComentario(DefesaComentario DefesaComentario) {
		
	}

}
