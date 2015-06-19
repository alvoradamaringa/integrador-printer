package br.com.alvoradamaringa.service.impl;

import java.util.List;

import javax.ejb.Stateless;

import br.com.alvoradamaringa.domain.PesquisaTipoTcc;
import br.com.alvoradamaringa.service.exceptions.IntegridadeException;
import br.com.alvoradamaringa.service.spec.PesquisaTipoTccService;

@Stateless
public class PesquisaTipoTccServiceBean implements PesquisaTipoTccService {

	@Override
	public List<PesquisaTipoTcc> consultarPesquisaTipoTcc(String descricao) {
		return null;
	}

	@Override
	public void salvarPesquisaTipoTcc(PesquisaTipoTcc pesquisaTipoTcc) {
		
	}

	@Override
	public void excluirPesquisaTipoTcc(PesquisaTipoTcc pesquisaTipoTcc)
			throws IntegridadeException {
		
	}

}
