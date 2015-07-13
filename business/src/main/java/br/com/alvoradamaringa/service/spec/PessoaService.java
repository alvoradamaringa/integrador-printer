package br.com.alvoradamaringa.service.spec;

import java.util.List;

import javax.ejb.Local;

import br.com.alvoradamaringa.domain.Aluno;
import br.com.alvoradamaringa.domain.Professor;
import br.com.alvoradamaringa.domain.ProfessorCurso;
import br.com.alvoradamaringa.service.exceptions.CpfDuplicadoException;
import br.com.alvoradamaringa.service.exceptions.CpfNaoInformadoException;
import br.com.alvoradamaringa.service.exceptions.IntegridadeException;
import br.com.alvoradamaringa.service.exceptions.RaDuplicadoException;
import br.com.alvoradamaringa.service.exceptions.RaNaoInformadoException;

@Local
public interface PessoaService {

	public void salvarAluno(Aluno aluno) throws RaNaoInformadoException, RaDuplicadoException;

	public void salvarProfessor(Professor professor)
			throws CpfNaoInformadoException, CpfDuplicadoException;

	public void excluirAluno(Aluno aluno) throws IntegridadeException;

	public void excluirProfessor(Professor professor)
			throws IntegridadeException;

	public List<Aluno> consultarAluno(String ra, String nomeAluno, String cpf);

	public List<Professor> consultarProfessor(String nomeProfessor, String cpf);

	public List<ProfessorCurso> consultarProfessorCurso(String nomeProfessor);

}
