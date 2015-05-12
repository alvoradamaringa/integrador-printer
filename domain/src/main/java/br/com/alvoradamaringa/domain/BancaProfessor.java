package br.com.alvoradamaringa.domain;

public class BancaProfessor {

	private Long idBancaProfessor;
	private DefesaAluno defesaAluno;
	private Professor professor;
	private TipoProfessor tipoProfessor;
	
	public void adicionarProfessor(Professor professor, TipoProfessor tipoProfessor) {
		this.professor = professor;
		this.tipoProfessor = tipoProfessor;
	}
	
	public void adicionarDefesaAluno(DefesaAluno defesaAluno) {
		this.defesaAluno = defesaAluno;
	}

	public Long getIdBancaProfessor() {
		return idBancaProfessor;
	}

	public Professor getProfessor() {
		return professor;
	}

	public DefesaAluno getDefesaAluno() {
		return defesaAluno;
	}

	public TipoProfessor getTipoProfessor() {
		return tipoProfessor;
	}

}
