package br.com.alvoradamaringa.persistence;

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

}
