package br.com.alvoradamaringa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BANCA_PROFESSOR")
public class BancaProfessor  implements Serializable {
	
	private static final long serialVersionUID = 23L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_BANCA_PROFESSOR")
	private Long idBancaProfessor;
	@ManyToOne
	@JoinColumn(name = "ID_DEFESA_ALUNO")
	private DefesaAluno defesaAluno;
	@ManyToOne
	@JoinColumn(name = "ID_PROFESSOR")
	private Professor professor;
	@Enumerated(EnumType.ORDINAL)
	private TipoProfessor tipoProfessor;

	public void adicionarProfessor(Professor professor,
			TipoProfessor tipoProfessor) {
		this.professor = professor;
		this.tipoProfessor = tipoProfessor;
	}

	public void adicionarDefesaAluno(DefesaAluno defesaAluno) {
		this.defesaAluno = defesaAluno;
	}

	public Long getIdBancaProfessor() {
		return idBancaProfessor;
	}

	public Professor getProfessor() {

		return professor;
	}

	public DefesaAluno getDefesaAluno() {
		return defesaAluno;
	}

	public TipoProfessor getTipoProfessor() {
		return tipoProfessor;
	}

}