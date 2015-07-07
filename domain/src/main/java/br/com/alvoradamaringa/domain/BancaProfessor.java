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
@Table(name = "BANCAPROFESSOR")
public class BancaProfessor implements Serializable {

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((defesaAluno == null) ? 0 : defesaAluno.hashCode());
		result = prime
				* result
				+ ((idBancaProfessor == null) ? 0 : idBancaProfessor.hashCode());
		result = prime * result
				+ ((professor == null) ? 0 : professor.hashCode());
		result = prime * result
				+ ((tipoProfessor == null) ? 0 : tipoProfessor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BancaProfessor other = (BancaProfessor) obj;
		if (defesaAluno == null) {
			if (other.defesaAluno != null)
				return false;
		} else if (!defesaAluno.equals(other.defesaAluno))
			return false;
		if (idBancaProfessor == null) {
			if (other.idBancaProfessor != null)
				return false;
		} else if (!idBancaProfessor.equals(other.idBancaProfessor))
			return false;
		if (professor == null) {
			if (other.professor != null)
				return false;
		} else if (!professor.equals(other.professor))
			return false;
		if (tipoProfessor != other.tipoProfessor)
			return false;
		return true;
	}

}