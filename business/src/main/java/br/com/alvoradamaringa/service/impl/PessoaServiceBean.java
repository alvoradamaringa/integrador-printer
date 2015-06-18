package br.com.alvoradamaringa.service.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.eclipse.persistence.internal.jpa.parsing.ExistsNode;

import br.com.alvoradamaringa.domain.Pessoa;
import br.com.alvoradamaringa.domain.Aluno;
import br.com.alvoradamaringa.domain.Professor;
import br.com.alvoradamaringa.persistence.AlunoDAO;
import br.com.alvoradamaringa.persistence.PessoaDAO;
import br.com.alvoradamaringa.persistence.ProfessorDAO;
import br.com.alvoradamaringa.service.exceptions.CpfDuplicadoException;
import br.com.alvoradamaringa.service.exceptions.CpfNuloException;
import br.com.alvoradamaringa.service.exceptions.NomeNuloException;
import br.com.alvoradamaringa.service.exceptions.RaDuplicadoException;
import br.com.alvoradamaringa.service.exceptions.RaNuloException;
import br.com.alvoradamaringa.service.spec.PessoaService;

@Stateless
public class PessoaServiceBean implements PessoaService {

	@EJB
	private PessoaDAO pessoaDAO;
	private AlunoDAO alunoDAO;
	private ProfessorDAO professorDAO;

	@Override
	public void adicionarAluno(Aluno aluno) throws RaNuloException,
			RaDuplicadoException {

		Aluno raValidado = alunoDAO.consultarRa(aluno.getRa());

		if (raValidado == null) {
			throw new RaNuloException();
		} else if (raValidado != null) {
			throw new RaDuplicadoException();
		}

		alunoDAO.salvar(aluno);

	}

	@Override
	public void adicionarProfessor(Professor professor)
			throws CpfNuloException, CpfDuplicadoException {

		Professor cpfValidado = professorDAO.consultarCpf(professor.getPessoa()
				.getCpf());

		if (cpfValidado == null) {
			throw new CpfNuloException();
		} else if (cpfValidado != null) {
			throw new CpfDuplicadoException();
		}

		professorDAO.salvar(professor);
	}

	@Override
	public void editarAluno(Aluno aluno) {
		alunoDAO.salvar(aluno);
	}

	@Override
	public void editarProfessor(Professor professor) {
		professorDAO.salvar(professor);
	}

	@Override
	public void excluirAluno(Aluno aluno) {
		alunoDAO.deletar(aluno);
	}

	@Override
	public void excluirProfessor(Professor professor) {
		professorDAO.deletar(professor);
	}

	@Override
	public void consultarAluno(String nomeAluno, String ra)
			throws RaNuloException, NomeNuloException {

		Aluno raConsultado = alunoDAO.consultarRa(((Aluno) alunoDAO).getRa());
		Aluno nomeAlunoConsultado = alunoDAO
				.consultarNomeAluno(((Pessoa) alunoDAO).getNome());

		if (raConsultado == null) {
			throw new RaNuloException();
		} else if (raConsultado != null) {

			alunoDAO.consultarRa(ra);
		}
		
		if (nomeAlunoConsultado == null) {
			throw new NomeNuloException();
		} else if (nomeAlunoConsultado != null) {

			alunoDAO.consultarRa(nomeAluno);
		}
	}

	@Override
	public void consultarProfessor(String nomeProfessor, String cpf) {
		professorDAO.consultar(nomeProfessor, cpf);
	}

}
