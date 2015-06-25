package br.com.alvoradamaringa.persistence;

import java.util.List;

import javax.ejb.Local;

import br.com.alvoradamaringa.domain.PesquisaTipoTcc;

@Local
public interface PesquisaTipoTccDAO extends GenericDAO<Long, PesquisaTipoTcc> {
	
	public List<PesquisaTipoTcc> consultar(String descricao);
}
