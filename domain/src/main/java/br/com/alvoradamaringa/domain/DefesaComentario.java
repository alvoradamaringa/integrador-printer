package br.com.alvoradamaringa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DEFESA_COMENTARIO")
public class DefesaComentario implements Serializable {
	
	private static final long serialVersionUID = 23L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DEFESA_COMENTARIO")
	private Long idDefesaComentario;
	@ManyToOne
	@JoinColumn(name = "ID_DEFESA_ALUNO")
	private DefesaAluno defesaAluno;
	@ManyToOne
	@JoinColumn(name = "ID_PROFESSOR_CURSO")
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
