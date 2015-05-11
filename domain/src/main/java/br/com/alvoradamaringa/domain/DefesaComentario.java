package br.com.alvoradamaringa.domain;

public class DefesaComentario extends DefesaComentarioDAOImpl {

    private Long idDefesaComentario;
    private ProfessorCurso professorCurso;
    private String comentario;

    public void adicionarComentario(String comentario) {
        this.comentario = comentario;
    }

	public void adicionarProfessorCurso(ProfessorCurso professorCurso) {
		this.professorCurso = professorCurso;
	}
}
