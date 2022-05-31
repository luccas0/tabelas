package com.fiap.luccas.dao.impl;

import javax.persistence.EntityManager;

import com.fiap.luccas.dao.SerieDao;
import com.fiap.luccas.exception.CommitException;
import com.fiap.luccas.exception.IdNotFoundException;

import dominio.Anime;



public class SerieDaoImpl implements SerieDao {
	
private EntityManager em;
	
	public SerieDaoImpl(EntityManager em) {
		this.em = em;
	}

	public Anime pesquisar(Long id) throws IdNotFoundException {
		//Pesquisar a Anime no banco
		 Anime Anime = em.find( Anime.class, id);
		//Validar se a Anime não existe (se é igual null)
		if (Anime == null)
			//Se existir, lançar uma exception
			throw new IdNotFoundException(); 
		//Se não existir, Retorna a Anime
		return Anime;
	}

	public void cadastrar(Anime anime) {
		em.persist(anime);
	}

	public void atualizar(Anime anime) throws IdNotFoundException {
		//validar se a Anime existe no banco, para ser atualizado
		pesquisar(anime.getCodigoAnime()); 
		em.merge(anime);
	}

	public void remover(Long id) throws IdNotFoundException {
		Anime Anime = pesquisar(id);
		em.remove(Anime);
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
