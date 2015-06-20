package br.com.alvoradamaringa.service.spec;

import java.util.List;

import javax.ejb.Local;

import br.com.alvoradamaringa.domain.Curso;
import br.com.alvoradamaringa.service.exceptions.IntegridadeException;

@Local
public interface CursoService {

	List<Curso> consultarCurso(String descricao);

	void salvarCurso(Curso curso);

	void excluirCurso(Curso curso) throws IntegridadeException;

}
