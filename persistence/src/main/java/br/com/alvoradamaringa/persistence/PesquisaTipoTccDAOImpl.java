package br.com.alvoradamaringa.persistence;

import java.util.List;

import javax.ejb.Stateless;

import br.com.alvoradamaringa.domain.PesquisaTipoTcc;

@Stateless
public class PesquisaTipoTccDAOImpl extends GenericDAOImpl<Long, PesquisaTipoTcc> implements PesquisaTipoTccDAO {

	public List<PesquisaTipoTcc> consultar(String descricao) {
		return null;
	}
}
