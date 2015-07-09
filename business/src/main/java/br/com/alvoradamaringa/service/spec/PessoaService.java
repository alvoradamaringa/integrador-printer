package br.com.alvoradamaringa.service.spec;

import java.util.List;

import javax.ejb.Local;

import br.com.alvoradamaringa.domain.Aluno;
import br.com.alvoradamaringa.domain.Pessoa;
import br.com.alvoradamaringa.domain.Professor;
import br.com.alvoradamaringa.domain.ProfessorCurso;
import br.com.alvoradamaringa.domain.Usuario;
import br.com.alvoradamaringa.service.exceptions.CpfDuplicadoException;
import br.com.alvoradamaringa.service.exceptions.CpfNaoInformadoException;
import br.com.alvoradamaringa.service.exceptions.IntegridadeException;
import br.com.alvoradamaringa.service.exceptions.RaDuplicadoException;
import br.com.alvoradamaringa.service.exceptions.RaNaoInformadoException;

@Local
public interface PessoaService {

	void salvarAluno(Aluno aluno) throws RaNaoInformadoException,
			RaDuplicadoException;

	void adicionarProfessor(Professor professor)
			throws CpfNaoInformadoException, CpfDuplicadoException;

	void salvarPessoa(Pessoa pessoa);
	
	void excluirAluno(Aluno aluno) throws IntegridadeException;
	void excluirPessoa(Pessoa pessoa) throws IntegridadeException;
	void excluirProfessor(Professor professor) throws IntegridadeException;
	public Pessoa alterarPessoa(Pessoa pessoa);
	List<Aluno> consultarAluno(String ra, String nome, String cpf);

	List<Pessoa> consultarPessoa(String nome, String cpf);
	List<Professor> consultarProfessor(String nome, String cpf);
	List<ProfessorCurso> consultarProfessorCurso(String nomeProfessor);

}
