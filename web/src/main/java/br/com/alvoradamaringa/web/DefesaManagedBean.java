package br.com.alvoradamaringa.web;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.alvoradamaringa.domain.DefesaAluno;
import br.com.alvoradamaringa.domain.DefesaComentario;
import br.com.alvoradamaringa.domain.ProfessorCurso;
import br.com.alvoradamaringa.service.spec.PessoaService;

@SessionScoped
@ManagedBean
public class DefesaManagedBean implements Serializable {

	private static final long serialVersionUID = 23L;
	private DefesaAluno defesa = new DefesaAluno();
	private DefesaComentario defesaComentario;
	private ProfessorCurso professorCurso;
	private String comentario;
	private String nomeProfessor;
	
	@EJB
	private PessoaService pessoaService;

	public void adicionarComentario() {
		defesa.adicionarComentario(defesa, professorCurso, comentario);
		professorCurso = null;
		comentario = null;
	}

	public void removerComentario() {
		defesa.removerComentario(defesaComentario);
		defesaComentario = null;
	}
	
	public List<ProfessorCurso> consultarProfessor() {
		return pessoaService.consultarProfessorCurso(nomeProfessor);
	}

	public DefesaAluno getDefesa() {
		return defesa;
	}

	public void setDefesa(DefesaAluno defesa) {
		this.defesa = defesa;
	}

	public void cadastrarDefesa() {
		System.out.println("Cadastrando Defesa");
	}

	public List<DefesaAluno> getDefesas() {
		return null;
	}

	public ProfessorCurso getProfessorCurso() {
		return professorCurso;
	}

	public void setProfessorCurso(ProfessorCurso professorCurso) {
		this.professorCurso = professorCurso;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public DefesaComentario getDefesaComentario() {
		return defesaComentario;
	}

	public void setDefesaComentario(DefesaComentario defesaComentario) {
		this.defesaComentario = defesaComentario;
	}

}
