package com.fiap.luccas.dao.impl;

import javax.persistence.EntityManager;

import com.fiap.luccas.dao.GenericDao;
import com.fiap.luccas.exception.CommitException;
import com.fiap.luccas.exception.IdNotFoundException;



public class GenericDaoImpl<T,K> implements GenericDao<T, K> {
	
private EntityManager em;
	
	public GenericDaoImpl(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(T entidade) {
		em.persist(entidade);
	}

	public void atualizar(T entidade) {
		em.merge(entidade);
	}

	public void remover(K id) throws IdNotFoundException {
		T entidade = pesquisar(id);
		em.remove(entidade);
	}

	public T pesquisar(K id) throws IdNotFoundException {
		T entidade = em.find(T.class, id);
		if (entidade == null)
			throw new IdNotFoundException();
		return entidade;
	}

	public void commit() throws CommitException {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new CommitException();
		}
	}

}
