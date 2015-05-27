package br.com.alvoradamaringa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

    @Entity
    @Table (name = "ALUNO_CURSO")
    public class AlunoCurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ALUNO_CURSO")
    private Long idAlunoCurso;

    @ManyToOne
    @JoinColumn(name = "ID_ALUNO")
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "ID_CURSO")
    private Curso curso;
	
	public void adicionarAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public void adicionarCurso(Curso curso) {
		this.curso = curso;
	}

	public Long getIdAlunoCurso() {
		return idAlunoCurso;
	}
	
	public Aluno getAluno() {
		return aluno;
	}

	public Curso getCurso() {
		return curso;
	}


	
}
