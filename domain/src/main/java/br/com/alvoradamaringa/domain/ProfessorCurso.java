package br.com.alvoradamaringa.domain;

public class ProfessorCurso {
	
	private Long idProfessorCurso;
	private Curso curso;
	private Professor professor;
	
	public void adicionarProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public void adicionarCurso(Curso curso) {
		this.curso = curso;
	}
		
	public Long getIdProfessorCurso(){
		return idProfessorCurso;
	}
	
	public Curso getCurso(){
		return curso;
	}
	
	public Professor getProfessor(){
		return professor;
	}
	
}
