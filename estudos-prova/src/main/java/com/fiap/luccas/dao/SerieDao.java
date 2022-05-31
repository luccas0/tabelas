package com.fiap.luccas.dao;

import com.fiap.luccas.exception.CommitException;
import com.fiap.luccas.exception.IdNotFoundException;

import dominio.Anime;

public interface SerieDao {
	
Anime pesquisar(Long id) throws IdNotFoundException;
	
	void cadastrar(Anime anime);
	
	void atualizar(Anime anime) throws IdNotFoundException;
	
	void remover(Long id) throws IdNotFoundException;
	
	void commit() throws CommitException;


}
