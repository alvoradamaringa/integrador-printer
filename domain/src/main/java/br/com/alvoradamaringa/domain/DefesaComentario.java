package br.com.alvoradamaringa.domain;

public class DefesaComentario extends DefesaComentarioDAOImpl {

    private DefesaAluno defesaComentario;
    private ProfessorCurso professorComentario;
    private String comentario;

    public DefesaAluno getDefesaComentario() {
        return defesaComentario;
    }

    public void setDefesaComentario(DefesaAluno defesaComentario) {
        this.defesaComentario = defesaComentario;
    }

    public ProfessorCurso getProfessorComentario() {
        return professorComentario;
    }

    public void setProfessorComentario(ProfessorCurso professorComentario) {
        this.professorComentario = professorComentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    public void adicionarComentario(String adicionarComentario){
    	this.defesaComentario = setComentario(adicionarComentario);
    }
}
