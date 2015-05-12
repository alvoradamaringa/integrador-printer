package br.com.alvoradamaringa.domain;

public class Aluno {

	private Long idAluno;
	private Pessoa pessoa;
	private String Ra;
	
	public void adicionarPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Long getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Long idAluno) {
		this.idAluno = idAluno;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public String getRa() {
		return Ra;
	}

	public void setRa(String ra) {
		Ra = ra;
	}

}
