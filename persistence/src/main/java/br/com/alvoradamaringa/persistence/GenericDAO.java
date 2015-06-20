package br.com.alvoradamaringa.persistence;

import java.util.List;

public interface GenericDAO<K, T> {

	T findById(K id);
	
	void salvar(T object);
	
	void deletar(T object);
	
	List<T> findAll();
}
