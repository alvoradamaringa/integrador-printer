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
public class ProfessorCurso  implements Serializable {
	
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

}
