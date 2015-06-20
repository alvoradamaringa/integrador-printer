package br.com.alvoradamaringa.persistence;

import java.util.List;

import br.com.alvoradamaringa.domain.PesquisaTipoTcc;

public interface PesquisaTipoTccDAO extends GenericDAO<Long, PesquisaTipoTcc> {
	
	public List<PesquisaTipoTcc> consultar(String descricao);
}
