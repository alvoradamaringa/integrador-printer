package br.com.alvoradamaringa.persistence;

public interface GenericDAO<K, T> {

	T findById(K id);
	
	void salvar(T object);
	
	void deletar(T object);
}
