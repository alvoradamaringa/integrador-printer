package br.com.alvoradamaringa.domain;

public class ProfessorCurso {
	private Long idProfessorCurso;
	private Curso curso;
	private Professor professor;
		
	public void adicionarCurso(Curso curso){
		this.curso = curso;
	}
	
	public void adicionarProfessor(Professor professor){
		this.professor = professor;
	}
	
}
