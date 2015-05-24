package br.com.alvoradamaringa.persistence;

import java.util.List;

public abstract class GenericDAOImpl<K, T> implements GenericDAO<K, T> {

	@Override
	public T findById(K id) {
		return null;
	}

	@Override
	public void salvar(T object) {
		
	}

	@Override
	public void deletar(T object) {
		
	}

	@Override
	public List<T> findAll() {
		return null;
	}
}
