package br.com.alvoradamaringa.service.impl;

import javax.ejb.Stateless;

import br.com.alvoradamaringa.domain.Aluno;
import br.com.alvoradamaringa.domain.Pessoa;
import br.com.alvoradamaringa.domain.Professor;
import br.com.alvoradamaringa.persistence.AlunoDAO;
import br.com.alvoradamaringa.persistence.ProfessorDAO;
import br.com.alvoradamaringa.service.exceptions.CpfDuplicadoException;
import br.com.alvoradamaringa.service.exceptions.CpfNaoInformadoException;
import br.com.alvoradamaringa.service.exceptions.RaDuplicadoException;
import br.com.alvoradamaringa.service.exceptions.RaNaoInformadoException;
import br.com.alvoradamaringa.service.spec.PessoaService;

@Stateless
public class PessoaServiceBean implements PessoaService {

	private AlunoDAO alunoDAO;
	private ProfessorDAO professorDAO;

	@SuppressWarnings("unused")
	@Override
	public void salvarAluno(Aluno aluno) throws RaNaoInformadoException,
			RaDuplicadoException {

		Aluno raValidado = alunoDAO.consultarRa(aluno.getRa());

		if (raValidado == null) {
			throw new RaNaoInformadoException();
		} else if (raValidado != null) {
			throw new RaDuplicadoException();
		}

		alunoDAO.salvar(aluno);

	}

	@SuppressWarnings("unused")
	@Override
	public void adicionarProfessor(Professor professor)
			throws CpfNaoInformadoException, CpfDuplicadoException {

		Professor cpfValidado = professorDAO.consultarCpf(professor.getPessoa()
				.getCpf());

		if (cpfValidado == null) {
			throw new CpfNaoInformadoException();
		} else if (cpfValidado != null) {
			throw new CpfDuplicadoException();
		}

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

	@SuppressWarnings("unused")
	@Override
	public void consultarAluno(String ra, String nomeAluno, String cpf) {
		Aluno raConsultado = alunoDAO.consultarRa(((Aluno) alunoDAO).getRa());
		Aluno nomeAlunoConsultado = alunoDAO
				.consultarNomeAluno(((Pessoa) alunoDAO).getNome());

		alunoDAO.consultarRa(nomeAluno);
	}

	@Override
	public void consultarProfessor(String nomeProfessor, String cpf) {
		professorDAO.consultar(nomeProfessor, cpf);
	}

}
