package br.com.alvoradamaringa.persistence;

import java.util.List;

import br.com.alvoradamaringa.domain.Pessoa;

public interface PessoaDAO extends GenericDAO<Long, Pessoa> {

	public List<Pessoa> consultar(String nome, String cpf);

}
