package com.fiap.luccas.main;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.fiap.luccas.dao.SerieDao;
import com.fiap.luccas.dao.impl.SerieDaoImpl;
import com.fiap.luccas.exception.CommitException;
import com.fiap.luccas.exception.IdNotFoundException;
import com.fiap.luccas.singleton.Singleton;

import dominio.GeneroAnime;
import dominio.Anime;



public class ExemploSerie {

	public static void main(String[] args) {
		
		//Obter uma fabrica
				EntityManagerFactory fabrica = Singleton.getInstance();
				
				//Obter um entity manager
				EntityManager em = fabrica.createEntityManager();
				
				//Instanciar uma Anime
				Anime anime = new Anime ("Gintama", "Hideaki Sorachi", "Sunrise", 
						GeneroAnime.SHOUNEN);
				
				
				
				//Instanciar uma AnimeDaoImpl
				SerieDao dao = new SerieDaoImpl(em);
				
				//Cadastrar
				try {
					dao.cadastrar(anime);
					dao.commit();
				} catch (CommitException e) {
					System.out.println(e.getMessage());
				}

				try {
					//Pesquisar pela PK
					Anime busca = dao.pesquisar(1L);
					//Exibir o nome
					System.out.println(busca.getNomeAnime());
				} catch (IdNotFoundException e) {
					System.out.println(e.getMessage());
				}
				
				try {
					//Atualizar o nome da Anime
					anime.setEstudioAnime("BNP");;
					dao.atualizar(anime);
					dao.commit();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				
				//Remover
				try {
					dao.remover(1L);
					dao.commit();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				//Fechar
				em.close();
				fabrica.close();

	}

}
