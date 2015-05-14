package br.com.alvoradamaringa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_ALUNO")
	private Long idAluno;
	@ManyToOne
	@JoinColumn(name = "ID_PESSOA")
	private Pessoa pessoa;
	private String ra;
	
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
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

}
