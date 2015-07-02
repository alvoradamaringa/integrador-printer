package br.com.alvoradamaringa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Joao
 */

@Entity
@Table (name = "PROFESSOR")
public class Professor implements Serializable {
	
	private static final long serialVersionUID = 23L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PROFESSOR")
	private Long idProfessor;
	@ManyToOne
	@JoinColumn(name = "ID_PESSOA")
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

	public String getCpf() {
		if (pessoa == null) {
			return null;
		} else {
			return pessoa.getCpf();
		}
	}
}
