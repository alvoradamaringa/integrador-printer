package br.com.alvoradamaringa.web;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.alvoradamaringa.domain.Curso;
import br.com.alvoradamaringa.service.exceptions.IntegridadeException;
import br.com.alvoradamaringa.service.spec.CursoService;
import br.com.alvoradamaringa.web.util.FacesUtils;

@ViewScoped
@ManagedBean
public class CursoManagedBean implements Serializable {

	private static final String TELA_CONSULTA = "/curso/ConsultaCurso.xhtml";
	private static final String TELA_CADASTRO = "/curso/CadastroCurso.xhtml";
	private static final long serialVersionUID = 23L;
	private Curso curso = new Curso();
	private List<Curso> listaCurso;
	private String descricao;
	
	@EJB
	private CursoService cursoService;
	
	
	public void novoCurso() {
		curso = new Curso();
		FacesUtils.redirect(TELA_CADASTRO);
	}
	
	public void salvarCurso() {
		try {
			cursoService.salvarCurso(curso);
			//consultarCurso();
			FacesUtils.redirect(TELA_CONSULTA);
		} catch (Exception ex) {
			FacesUtils.redirect(TELA_CADASTRO);
		}
	}

	public void editarCurso() {
		try {
	//		curso = cursoService.editaCurso(curso);
			FacesUtils.redirect(TELA_CADASTRO);
		} catch (Exception ex) {
			FacesUtils.redirect(TELA_CONSULTA);
		}
	}

	public void excluirCurso() {
		try {
			cursoService.excluirCurso(curso);
			listaCurso = cursoService.consultarCurso(descricao);
		} catch (IntegridadeException ex) {
			FacesUtils
					.adicionarMensagemErro("Este registro já está sendo utilizado!");
		} catch (Exception ex) {
			FacesUtils
					.adicionarMensagemErro("Erro ao excluir curso, por favor entre em contato com o administrador!");
		}
	}

	public void consultarCurso() {
		listaCurso = cursoService
				.consultarCurso(descricao);
	}
	
	public void menu() {
		//consultarCurso();
		FacesUtils.redirect(TELA_CONSULTA);
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public List<Curso> getListaCurso() {
		return listaCurso;
	}

	public void setListaCurso(List<Curso> listaCurso) {
		this.listaCurso = listaCurso;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
