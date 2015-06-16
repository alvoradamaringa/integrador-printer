package br.com.alvoradamaringa.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class GenericDAOImpl<K, T> implements GenericDAO<K, T> {

	private T type;

	@PersistenceContext(unitName = "IntegradorPrinterPU")
	protected EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public T findById(K id) {
		return (T) entityManager.find(type.getClass(), id);
	}

	@Override
	public void salvar(T object) {
		entityManager.merge(object);
	}

	@Override
	public void deletar(T object) {
		entityManager.remove(object);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		return (List<T>) entityManager.find(type.getClass(), null);
	}
}
