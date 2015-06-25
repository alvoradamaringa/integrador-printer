package br.com.alvoradamaringa.persistence;

import java.util.List;

import javax.ejb.Stateless;

import br.com.alvoradamaringa.domain.Pessoa;

@Stateless
public class PessoaDAOImpl extends GenericDAOImpl<Long, Pessoa> implements
		PessoaDAO {

	public List<Pessoa> consultar(String nome, String cpf) {
		return null;
	}

}
