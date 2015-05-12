package br.com.alvoradamaringa.domain;

public class AlunoCurso {

	private Long idAlunoCurso;
	private Aluno aluno;
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
