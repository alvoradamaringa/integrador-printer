package br.com.alvoradamaringa.web;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.alvoradamaringa.domain.Curso;

@ViewScoped
@ManagedBean
public class CursoManagedBean implements Serializable {

	private static final long serialVersionUID = 23L;
	private Curso curso;
	
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public void cadastrarCurso(){
		System.out.println("Cadastrando Curso");
	}
	
	public List<Curso> getCursos(){
		return null;
	}
}
