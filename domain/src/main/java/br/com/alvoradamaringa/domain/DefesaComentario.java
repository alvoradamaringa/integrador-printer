package br.com.alvoradamaringa.domain;

public class DefesaComentario {

	private Long idDefesaComentario;
	private DefesaAluno defesaAluno;
	private ProfessorCurso professorCurso;
	private String comentario;

	public void adicionarComentario(DefesaAluno defesaAluno,
			ProfessorCurso professorCurso, String comentario) {
		this.defesaAluno = defesaAluno;
		this.professorCurso = professorCurso;
		this.comentario = comentario;
	}

	public Long getIdDefesaComentario() {
		return idDefesaComentario;
	}

	public DefesaAluno getDefesaAluno() {
		return defesaAluno;
	}

	public ProfessorCurso getProfessorCurso() {
		return professorCurso;
	}

	public String getComentario() {
		return comentario;
	}

}
