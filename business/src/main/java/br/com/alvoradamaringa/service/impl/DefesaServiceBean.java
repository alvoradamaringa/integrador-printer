package br.com.alvoradamaringa.service.impl;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.alvoradamaringa.domain.Aluno;
import br.com.alvoradamaringa.domain.BancaProfessor;
import br.com.alvoradamaringa.domain.DefesaAluno;
import br.com.alvoradamaringa.domain.DefesaComentario;
import br.com.alvoradamaringa.persistence.DefesaAlunoDAO;
import br.com.alvoradamaringa.service.exceptions.AlunoNaoInformadoException;
import br.com.alvoradamaringa.service.exceptions.BancaException;
import br.com.alvoradamaringa.service.exceptions.IntegridadeException;
import br.com.alvoradamaringa.service.spec.DefesaService;

@Stateless
public class DefesaServiceBean implements DefesaService {

	@EJB
	private DefesaAlunoDAO defesaAlunoDAO;

	@Override
	public List<DefesaAluno> consultarDefesa(Date data, String tema,
			String nomeAluno) {

		List<DefesaAluno> lista = defesaAlunoDAO.consultar(nomeAluno, data,
				tema);
		return lista;
	}

	@Override
	public void salvarDefesa(List<BancaProfessor> bancaProfessores,
			DefesaAluno defesaAluno) throws AlunoNaoInformadoException,
			BancaException {

		Aluno aluno = defesaAluno.getAluno();

		if (aluno == null) {
			throw new AlunoNaoInformadoException();
		}

		if (bancaProfessores.size() < 3) {
			throw new BancaException();
		}

		defesaAluno.adicionarBancaProfessores(bancaProfessores);
		defesaAlunoDAO.salvar(defesaAluno);
	}

	@Override
	public void excluirDefesa(DefesaAluno defesaAluno)
			throws IntegridadeException {
		try {
			defesaAlunoDAO.deletar(defesaAluno);
		} catch (Exception ex) {
			throw new IntegridadeException();
		}
	}

	@Override
	public void adicionarComentario(DefesaComentario defesaComentario,
			DefesaAluno defesaAluno) {
		defesaAluno.getComentarios().add(defesaComentario);
		defesaAlunoDAO.salvar(defesaAluno);
	}

	@Override
	public void excluirComentario(DefesaComentario DefesaComentario,
			DefesaAluno defesaAluno) {
		defesaAluno.getComentarios().remove(DefesaComentario);
		defesaAlunoDAO.salvar(defesaAluno);
	}

}
