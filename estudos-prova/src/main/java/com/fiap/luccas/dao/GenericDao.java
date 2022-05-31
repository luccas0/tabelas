package com.fiap.luccas.dao;

import com.fiap.luccas.exception.CommitException;
import com.fiap.luccas.exception.IdNotFoundException;

public interface GenericDao <T, K> {
	
void cadastrar(T entidade);
	
	void atualizar(T entidade);
	
	void remover(K id) throws IdNotFoundException;
	
	T pesquisar(K id) throws IdNotFoundException;
	
	void commit() throws CommitException;

}
