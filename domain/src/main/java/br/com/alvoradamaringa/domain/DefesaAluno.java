package br.com.alvoradamaringa.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author jhony
 */
public class DefesaAluno {

	private Long idDefesaAluno;
	private Aluno aluno;
	private PesquisaTipoTcc pesquisaTipoTcc;
	private List<DefesaComentario> comentarios = new ArrayList<DefesaComentario>();
	private BigDecimal nota;
	private Date data;
	private String status;
	private String tema;
	
	public void adicionarAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public void adicionarTipoTcc(PesquisaTipoTcc pesquisaTipoTcc) {
		this.pesquisaTipoTcc = pesquisaTipoTcc;
	}

	public void adicionarComentario(DefesaAluno defesaAluno, ProfessorCurso professorCurso, String comentario) {
		DefesaComentario defesaComentario = new DefesaComentario();
		defesaComentario.adicionarComentario(defesaAluno, professorCurso, comentario);
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

}
