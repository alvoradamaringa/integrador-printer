package br.com.alvoradamaringa.service.spec;

import javax.ejb.Local;

import br.com.alvoradamaringa.domain.Aluno;
import br.com.alvoradamaringa.domain.Professor;
import br.com.alvoradamaringa.service.exceptions.CpfDuplicadoException;
import br.com.alvoradamaringa.service.exceptions.CpfNuloException;
import br.com.alvoradamaringa.service.exceptions.NomeNuloException;
import br.com.alvoradamaringa.service.exceptions.RaDuplicadoException;
import br.com.alvoradamaringa.service.exceptions.RaNuloException;

@Local
public interface PessoaService {

	public void adicionarAluno(Aluno aluno) throws RaNuloException, RaDuplicadoException;
	public void adicionarProfessor(Professor professor) throws CpfNuloException, CpfDuplicadoException;
	
	public void editarAluno(Aluno aluno) throws RaDuplicadoException, RaNuloException;
	public void editarProfessor(Professor professor) throws CpfNuloException, CpfDuplicadoException;
	
	public void excluirAluno(Aluno aluno);
	public void excluirProfessor(Professor professor);
	
	public void consultarAluno(String ra, String nome) throws RaNuloException, NomeNuloException;
	public void consultarProfessor(String nome, String cpf) throws CpfDuplicadoException;
	
}
