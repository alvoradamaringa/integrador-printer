package br.com.alvoradamaringa.service.impl;


import br.com.alvoradamaringa.domain.Curso;
import br.com.alvoradamaringa.persistence.CursoDAO;
import br.com.alvoradamaringa.service.exceptions.ExcluirCursoException;
import br.com.alvoradamaringa.service.spec.CursoService;
@Stateless
public class CursoServiceBean implements CursoService {

	private CursoDAO cursoDAO;

	public void cadastrarCurso(Curso curso){
		cursoDAO.salvar(curso);
	}
	
	public Curso consultaCurso( String descricao){
		cursoDAO.consultar(descricao);
	}
	
	public void excluirCurso(Curso curso){
		cursoDAO.deletar(curso);
	}
}
