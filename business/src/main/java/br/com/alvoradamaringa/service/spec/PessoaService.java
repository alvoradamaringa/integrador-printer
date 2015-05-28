package br.com.alvoradamaringa.service.spec;

import br.com.alvoradamaringa.domain.Pessoa;
import br.com.alvoradamaringa.domain.Aluno;
import br.com.alvoradamaringa.domain.Professor;

public interface PessoaService {

	public void adicionarAluno(Aluno aluno);
	public void adicionarProfessor(Professor professor);
	
	public void editarAluno(Aluno aluno);
	public void editarProfessor(Professor professor);
	
	public void excluirAluno(Aluno aluno);
	public void excluirProfessor(Professor professor);
	
	public void consultarAluno(String ra, String nome);
	public void consultarProfessor(String nome, String cpf);
	
}
