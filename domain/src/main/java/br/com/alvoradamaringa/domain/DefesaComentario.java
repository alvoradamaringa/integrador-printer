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
@Table(name = "DEFESACOMENTARIO")
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((comentario == null) ? 0 : comentario.hashCode());
		result = prime * result
				+ ((defesaAluno == null) ? 0 : defesaAluno.hashCode());
		result = prime
				* result
				+ ((idDefesaComentario == null) ? 0 : idDefesaComentario
						.hashCode());
		result = prime * result
				+ ((professorCurso == null) ? 0 : professorCurso.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DefesaComentario other = (DefesaComentario) obj;
		if (comentario == null) {
			if (other.comentario != null)
				return false;
		} else if (!comentario.equals(other.comentario))
			return false;
		if (defesaAluno == null) {
			if (other.defesaAluno != null)
				return false;
		} else if (!defesaAluno.equals(other.defesaAluno))
			return false;
		if (idDefesaComentario == null) {
			if (other.idDefesaComentario != null)
				return false;
		} else if (!idDefesaComentario.equals(other.idDefesaComentario))
			return false;
		if (professorCurso == null) {
			if (other.professorCurso != null)
				return false;
		} else if (!professorCurso.equals(other.professorCurso))
			return false;
		return true;
	}

}
