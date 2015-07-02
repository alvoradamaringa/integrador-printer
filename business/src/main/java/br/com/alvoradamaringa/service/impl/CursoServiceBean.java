package br.com.alvoradamaringa.service.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.alvoradamaringa.domain.Curso;
import br.com.alvoradamaringa.persistence.CursoDAO;
import br.com.alvoradamaringa.service.exceptions.IntegridadeException;
import br.com.alvoradamaringa.service.spec.CursoService;
@Stateless
public class CursoServiceBean implements CursoService {

	@EJB
	private CursoDAO cursoDAO;
	
	@Override
	public void salvarCurso(Curso curso) {
		cursoDAO.salvar(curso);
	}

	@Override
	public List<Curso> consultarCurso(String descricao) {
		
		return cursoDAO.consultar(descricao);
		
	}

	@Override
	public void excluirCurso(Curso curso) throws IntegridadeException {
		
		try{
			cursoDAO.deletar(curso);
		}catch(Exception exception){
			throw new IntegridadeException();
		}
	}

}

