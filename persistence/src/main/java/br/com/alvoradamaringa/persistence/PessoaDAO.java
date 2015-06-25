package br.com.alvoradamaringa.persistence;

import java.util.List;

import javax.ejb.Local;

import br.com.alvoradamaringa.domain.Pessoa;

@Local
public interface PessoaDAO extends GenericDAO<Long, Pessoa> {

	public List<Pessoa> consultar(String nome, String cpf);

}
