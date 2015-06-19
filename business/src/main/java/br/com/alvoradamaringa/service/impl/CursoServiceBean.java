package br.com.alvoradamaringa.service.impl;

import java.util.List;

import javax.ejb.Stateless;

import br.com.alvoradamaringa.domain.Curso;
import br.com.alvoradamaringa.service.exceptions.IntegridadeException;
import br.com.alvoradamaringa.service.spec.CursoService;

@Stateless
public class CursoServiceBean implements CursoService {

	@Override
	public void salvarCurso(Curso curso) {
		
	}

	@Override
	public List<Curso> consultarCurso(String descricao) {
		return null;
	}

	@Override
	public void excluirCurso(Curso curso) throws IntegridadeException {
		
	}

}
