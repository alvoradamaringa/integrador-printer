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
	private Lista<BancaProfessores> banca = new ArrayList<BancaProfessores>();
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
	
	public void adicionarBancaProfessores(List<BancaProfessores> banca){
		
		banca.addAll(banca);
		
	}

}
