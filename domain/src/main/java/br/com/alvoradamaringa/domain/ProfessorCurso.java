package br.com.alvoradamaringa.domain;

public class ProfessorCurso {
	private Integer idProfessorCurso;
	private Curso curso;
	private Professor professor;
		
	public Integer getIdProfessorCurso(){
		return idProfessorCurso;
	}
	
	public void setIdProfessorCurso(Integer idProfessorCurso){
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
