package br.com.alvoradamaringa.service.spec;

import java.util.List;

import javax.ejb.Local;

import br.com.alvoradamaringa.domain.PesquisaTipoTcc;
import br.com.alvoradamaringa.service.exceptions.IntegridadeException;

@Local
public interface PesquisaTipoTccService {

	List<PesquisaTipoTcc> consultarPesquisaTipoTcc(String descricao);

	void salvarPesquisaTipoTcc(PesquisaTipoTcc pesquisaTipoTcc);

	void excluirPesquisaTipoTcc(PesquisaTipoTcc pesquisaTipoTcc)
			throws IntegridadeException;
}
