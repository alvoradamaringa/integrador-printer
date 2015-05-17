package br.com.alvoradamaringa.persistence;

import br.com.alvoradamaringa.domain;

public interface PessoaDAO extends GenericDAO<Long, Pessoa> {
	public List<Pessoa> consultar(String nome, String cpf);	
}
