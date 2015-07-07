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

@Entity
@Table(name = "PROFESSORCURSO")
public class ProfessorCurso implements Serializable {

	private static final long serialVersionUID = 23L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PROFESSOR_CURSO")
	private Long idProfessorCurso;
	@ManyToOne
	@JoinColumn(name = "ID_CURSO")
	private Curso curso;
	@ManyToOne
	@JoinColumn(name = "ID_PROFESSOR")
	private Professor professor;

	public void adicionarProfessor(Professor professor) {
		this.professor = professor;
	}

	public void adicionarCurso(Curso curso) {
		this.curso = curso;
	}

	public Long getIdProfessorCurso() {
		return idProfessorCurso;
	}

	public Curso getCurso() {
		return curso;
	}

	public Professor getProfessor() {
		return professor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curso == null) ? 0 : curso.hashCode());
		result = prime
				* result
				+ ((idProfessorCurso == null) ? 0 : idProfessorCurso.hashCode());
		result = prime * result
				+ ((professor == null) ? 0 : professor.hashCode());
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
		ProfessorCurso other = (ProfessorCurso) obj;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (idProfessorCurso == null) {
			if (other.idProfessorCurso != null)
				return false;
		} else if (!idProfessorCurso.equals(other.idProfessorCurso))
			return false;
		if (professor == null) {
			if (other.professor != null)
				return false;
		} else if (!professor.equals(other.professor))
			return false;
		return true;
	}

}
