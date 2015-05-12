package br.com.alvoradamaringa.persistence;

import br.com.alvoradamaringa.domain;

public interface ProfessorCursoDAO extends GenericDAO<Long, ProfessorCurso>{
    
    public void consultarProfessorCurso(Long idProfessorCurso);
    
}
