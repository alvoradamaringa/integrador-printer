package br.com.alvoradamaringa.service.spec;

import javax.ejb.Local;

import br.com.alvoradamaringa.domain.Aluno;
import br.com.alvoradamaringa.domain.Professor;
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

	void excluirAluno(Aluno aluno) throws IntegridadeException;

	void excluirProfessor(Professor professor) throws IntegridadeException;

	void consultarAluno(String ra, String nome, String cpf);

	public void consultarProfessor(String nome, String cpf);

}
