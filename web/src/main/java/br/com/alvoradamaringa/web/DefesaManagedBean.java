package br.com.alvoradamaringa.web;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.alvoradamaringa.domain.BancaProfessor;
import br.com.alvoradamaringa.domain.DefesaAluno;
import br.com.alvoradamaringa.domain.DefesaComentario;
import br.com.alvoradamaringa.domain.Professor;
import br.com.alvoradamaringa.domain.ProfessorCurso;
import br.com.alvoradamaringa.domain.TipoProfessor;
import br.com.alvoradamaringa.service.spec.DefesaService;
import br.com.alvoradamaringa.service.spec.PessoaService;
import br.com.alvoradamaringa.web.util.FacesUtils;

@SessionScoped
@ManagedBean
public class DefesaManagedBean implements Serializable {

	private static final String TELA_CONSULTA = "/defesa/ConsultaDefesa.xhtml";
	private static final String TELA_CADASTRO = "/defesa/CadastroDefesa.xhtml";
	
	private static final long serialVersionUID = 23L;
	private DefesaAluno defesa = new DefesaAluno();
	private DefesaComentario defesaComentario;
	private ProfessorCurso professorCurso;
	private BancaProfessor bancaProfessor;
	private String comentario;
	private String nomeProfessor;
	private Professor professor;
	private TipoProfessor tipoProfessor;
	private List<DefesaAluno> defesas;
	private Date data;
	private String tema;
	private String nomeAluno;
	
	@EJB
	private PessoaService pessoaService;
	
	@EJB
	private DefesaService defesaService;
	
	@PostConstruct
	public void init() {
		defesas = defesaService.consultarDefesa(null, null, null);
	}

	public void adicionarComentario() {
		defesa.adicionarComentario(defesa, professorCurso, comentario);
		professorCurso = null;
		comentario = null;
	}

	public void removerComentario() {
		defesa.removerComentario(defesaComentario);
		defesaComentario = null;
	}
	
	public void adicionarProfessor(){
		bancaProfessor.adicionarProfessor(professor, tipoProfessor);
	}
	
	public void removerProfessor(){
		//falta o método para remoção de professor da banca
		//bancaProfessor.removeProfessor(professor);
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
		defesa = new DefesaAluno();
		FacesUtils.redirect(TELA_CADASTRO);
	}

	public List<DefesaAluno> getDefesas() {
		return defesas;
	}
	
	public void setListaDefesa(List<DefesaAluno> defesas) {
		this.defesas = defesas;
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
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	
	public void consultarDefesa() {
		defesas = defesaService.consultarDefesa(data, tema, nomeAluno);
	}
	
	public void menu() {
		consultarDefesa();
		FacesUtils.redirect(TELA_CONSULTA);
	}

	public BancaProfessor getBancaProfessor() {
		return bancaProfessor;
	}

	public void setBancaProfessor(BancaProfessor bancaProfessor) {
		this.bancaProfessor = bancaProfessor;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public TipoProfessor getTipoProfessor() {
		return tipoProfessor;
	}

	public void setTipoProfessor(TipoProfessor tipoProfessor) {
		this.tipoProfessor = tipoProfessor;
	}
}
