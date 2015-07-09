package br.com.alvoradamaringa.persistence;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class GenericDAOImpl<K, T> implements GenericDAO<K, T> {

	private  Class<T> clazz;

	@PersistenceContext(unitName = "IntegradorPrinterPU")
	protected EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public GenericDAOImpl() {
		clazz = (Class<T>) ((ParameterizedType) getClass()  
                .getGenericSuperclass()).getActualTypeArguments()[1];  
	}

	@Override
	public T findById(K id) {
		return (T) entityManager.find(clazz, id);
	}

	@Override
	public void salvar(T object) {
		entityManager.getTransaction().begin();
		entityManager.merge(object);
		entityManager.getTransaction().commit();
	}

	@Override
	public void deletar(T object) {
		entityManager.getTransaction().begin();
		entityManager.remove(entityManager.merge(object));
		entityManager.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		return (List<T>) entityManager.find(clazz, null);
	}
}
