package br.com.alvoradamaringa.domain;

/**
 *
 * @author Joao
 */
public class Professor {

	private Long idProfessor;
	private Pessoa pessoa;
	
	public void adicionarPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Long getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(Long idProfessor) {
		this.idProfessor = idProfessor;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}
	
}
