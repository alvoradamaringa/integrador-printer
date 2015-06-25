package br.com.alvoradamaringa.service.impl;

import java.util.List;

import javax.ejb.Stateless;

import br.com.alvoradamaringa.domain.Aluno;
import br.com.alvoradamaringa.domain.Professor;
import br.com.alvoradamaringa.persistence.AlunoDAO;
import br.com.alvoradamaringa.persistence.ProfessorDAO;
import br.com.alvoradamaringa.service.exceptions.CpfDuplicadoException;
import br.com.alvoradamaringa.service.exceptions.CpfNaoInformadoException;
import br.com.alvoradamaringa.service.exceptions.IntegridadeException;
import br.com.alvoradamaringa.service.exceptions.RaDuplicadoException;
import br.com.alvoradamaringa.service.exceptions.RaNaoInformadoException;
import br.com.alvoradamaringa.service.spec.PessoaService;

@Stateless
public class PessoaServiceBean implements PessoaService {

	private AlunoDAO alunoDAO;
	private ProfessorDAO professorDAO;

	@Override
	public void salvarAluno(Aluno aluno) throws RaNaoInformadoException, RaDuplicadoException {

		if (aluno.getRa() == null) {
			throw new RaNaoInformadoException();
		}

		Aluno raValidado = alunoDAO.consultarRa(aluno.getRa());

		if (raValidado != null) {
			throw new RaDuplicadoException();
		}

		alunoDAO.salvar(aluno);

	}

	@Override
	public void adicionarProfessor(Professor professor)
			throws CpfNaoInformadoException, CpfDuplicadoException {

		if (professor.getPessoa().getCpf() == null) {
			throw new CpfNaoInformadoException();
		}

		Professor cpfValidado = professorDAO.consultarCpf(professor.getPessoa().getCpf());

		if (cpfValidado != null) {
			throw new CpfDuplicadoException();
		}

		professorDAO.salvar(professor);
	}

	@Override
	public void excluirAluno(Aluno aluno) throws IntegridadeException {
		try {
			alunoDAO.deletar(aluno);
		} catch (Exception ex) {
			throw new IntegridadeException();
		}
	}

	@Override
	public void excluirProfessor(Professor professor)
			throws IntegridadeException {
		try {
			professorDAO.deletar(professor);
		} catch (Exception ex) {
			throw new IntegridadeException();
		}
	}

	@Override
	public List<Aluno> consultarAluno(String ra, String nomeAluno, String cpf) {

		List<Aluno> lista = alunoDAO.consultar(ra, nomeAluno, cpf);
		return lista;
	}

	@Override
	public List<Professor> consultarProfessor(String nomeProfessor, String cpf) {

		List<Professor> lista = professorDAO.consultar(nomeProfessor, cpf);
		return lista;

	}

}
