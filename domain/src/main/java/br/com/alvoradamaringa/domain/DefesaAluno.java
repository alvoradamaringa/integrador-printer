package br.com.alvoradamaringa.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jhony
 */

@Entity
@Table(name = "DEFESAALUNO")
public class DefesaAluno implements Serializable {

	private static final long serialVersionUID = 23L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DEFESA_ALUNO")
	private Long idDefesaAluno;
	@ManyToOne
	@JoinColumn(name = "ID_ALUNO")
	private Aluno aluno;
	@ManyToOne
	@JoinColumn(name = "ID_PESQUISA_TIPO_TCC")
	private PesquisaTipoTcc pesquisaTipoTcc;
	@OneToMany(mappedBy = "defesaAluno", fetch = FetchType.LAZY, targetEntity = DefesaComentario.class)
	private List<DefesaComentario> comentarios = new ArrayList<DefesaComentario>();
	@OneToMany(mappedBy = "defesaAluno", fetch = FetchType.LAZY, targetEntity = BancaProfessor.class)
	private List<BancaProfessor> banca = new ArrayList<BancaProfessor>();
	private BigDecimal nota;
	@Temporal(TemporalType.DATE)
	@Column(name = "DATA")
	private Date data;
	private String status;
	private String tema;

	public void adicionarAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public void adicionarTipoTcc(PesquisaTipoTcc pesquisaTipoTcc) {
		this.pesquisaTipoTcc = pesquisaTipoTcc;
	}

	public void adicionarComentario(DefesaAluno defesaAluno,
			ProfessorCurso professorCurso, String comentario) {
		DefesaComentario defesaComentario = new DefesaComentario();
		defesaComentario.adicionarComentario(defesaAluno, professorCurso,
				comentario);
		this.comentarios.add(defesaComentario);
	}

	public void removerComentario(DefesaComentario defesaComentario) {
		this.comentarios.remove(defesaComentario);
	}

	public void adicionarBancaProfessores(List<BancaProfessor> banca) {
		this.banca.addAll(banca);
	}

	public Long getIdDefesaAluno() {
		return idDefesaAluno;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public PesquisaTipoTcc getPesquisaTipoTcc() {
		return pesquisaTipoTcc;
	}

	public List<DefesaComentario> getComentarios() {
		return comentarios;
	}

	public BigDecimal getNota() {
		return nota;
	}

	public void setNota(BigDecimal nota) {
		this.nota = nota;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aluno == null) ? 0 : aluno.hashCode());
		result = prime * result + ((banca == null) ? 0 : banca.hashCode());
		result = prime * result
				+ ((comentarios == null) ? 0 : comentarios.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result
				+ ((idDefesaAluno == null) ? 0 : idDefesaAluno.hashCode());
		result = prime * result + ((nota == null) ? 0 : nota.hashCode());
		result = prime * result
				+ ((pesquisaTipoTcc == null) ? 0 : pesquisaTipoTcc.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((tema == null) ? 0 : tema.hashCode());
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
		DefesaAluno other = (DefesaAluno) obj;
		if (aluno == null) {
			if (other.aluno != null)
				return false;
		} else if (!aluno.equals(other.aluno))
			return false;
		if (banca == null) {
			if (other.banca != null)
				return false;
		} else if (!banca.equals(other.banca))
			return false;
		if (comentarios == null) {
			if (other.comentarios != null)
				return false;
		} else if (!comentarios.equals(other.comentarios))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (idDefesaAluno == null) {
			if (other.idDefesaAluno != null)
				return false;
		} else if (!idDefesaAluno.equals(other.idDefesaAluno))
			return false;
		if (nota == null) {
			if (other.nota != null)
				return false;
		} else if (!nota.equals(other.nota))
			return false;
		if (pesquisaTipoTcc == null) {
			if (other.pesquisaTipoTcc != null)
				return false;
		} else if (!pesquisaTipoTcc.equals(other.pesquisaTipoTcc))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (tema == null) {
			if (other.tema != null)
				return false;
		} else if (!tema.equals(other.tema))
			return false;
		return true;
	}

}
