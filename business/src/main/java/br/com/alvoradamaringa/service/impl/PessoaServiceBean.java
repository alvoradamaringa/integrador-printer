package br.com.alvoradamaringa.service.impl;

import br.com.alvoradamaringa.domain.Pessoa;
import br.com.alvoradamaringa.domain.Aluno;
import br.com.alvoradamaringa.domain.Professor;
import br.com.alvoradamaringa.persistence.AlunoDAO;
import br.com.alvoradamaringa.persistence.PessoaDAO;
import br.com.alvoradamaringa.persistence.ProfessorDAO;
import br.com.alvoradamaringa.service.spec.PessoaService;

public class PessoaServiceBean implements PessoaService {

	private PessoaDAO pessoaDAO;
	private AlunoDAO alunoDAO;
	private ProfessorDAO professorDAO;

        @Override
	public void adicionarAluno(Aluno aluno) {
		alunoDAO.salvar(aluno);
	}

        @Override
	public void adicionarProfessor(Professor professor) {
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
	public void consultarAluno(String nomeAluno, String ra) {
		alunoDAO.consultar(nomeAluno, ra);
	}

        @Override
	public void consultarProfessor(String nomeProfessor, String cpf) {
		professorDAO.consultar(nomeProfessor, cpf);
	}

}
