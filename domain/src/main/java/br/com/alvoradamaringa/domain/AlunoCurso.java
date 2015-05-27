package br.com.alvoradamaringa.domain;

import javax.persistence.*;

@Entity
public class AlunoCurso {

    @Id
    @GeneratedValue
    @Column( name = "ID_ALUNO_CURSO")
	private Long idAlunoCurso;
    @ManyToOne
    @JoinColumn (name = "ID_ALUNO")
	private Aluno aluno;
    @ManyToOne
    @JoinColumn (name = "ID_CURSO")
	private Curso curso;
	
	public void adicionarAluno(Aluno aluno) {
		this.setAluno(aluno);
	}
	
	public void adicionarCurso(Curso curso) {
		this.setCurso(curso);
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


    public void setIdAlunoCurso(Long idAlunoCurso) {
        this.idAlunoCurso = idAlunoCurso;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
