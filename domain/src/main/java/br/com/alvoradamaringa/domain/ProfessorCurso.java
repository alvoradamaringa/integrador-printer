package br.com.alvoradamaringa.domain;

public class ProfessorCurso {
	private Long idProfessorCurso;
	private Curso curso;
	private Professor professor;
		
	public Long getIdProfessorCurso(){
		return idProfessorCurso;
	}
	
	public void setIdProfessorCurso(Long idProfessorCurso){
		this.idProfessorCurso = idProfessorCurso;
	}
	
	public Curso getCurso(){
		return curso;
	}
	
	public void setCurso(Curso curso){
		this.curso = curso;
	}
	
	public Professor getProfessor(){
		return professor;
	}
	
	public void setProfessor(Professor professor){
		this.professor = professor;
	}
	
}
