package br.com.alvoradamaringa.domain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

public class MapeamentoTest {

	@Test
	public void deveriaMapearTodasAsClasses() {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("AlvoradaPrinterPUTest");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.close();
		factory.close();
	}
}
