package br.com.alvoradamaringa.domain;

public class BancaProfessor extends DefesaAluno {
	private Long idBancaProfessor;
	private Professor professor;
	private enum tipoProfessor{O,C,E};
    
	public Long getIdBancaProfessor(){
		return idBancaProfessor;
	}
	public void setIdBancaProfessor(Long idBancaProfessor){
	        this.idBancaProfessor=idBancaProfessor;
	}
	public Professor getProfessor(){
		 return professor;
	}
	public void setProfessor(Professor professor ){
		 this.professor=professor;
	}
	public enum getTipoProfessor(){
		 return tipoProfessor;
	}	   
	public void setTipoProfessor(enum tipoProfessor){
	        this.tipoProfessor=tipoProfessor;
	    }		  
}
