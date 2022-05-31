package aplicacao;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Anime;
import dominio.Dlc;
import dominio.Filme;
import dominio.GeneroAnime;
import dominio.GeneroFilme;
import dominio.GeneroJogo;
import dominio.GeneroSerie;
import dominio.Jogo;
import dominio.Serie;
import dominio.Usuario;

public class Programas {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudos-prova");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		/*
		Usuario usuario = new Usuario();
		usuario.setNome("Luccas");
		usuario.setTelefone("46376857948");
		usuario.setEmail("email@gmail.com");
		
		em.persist(usuario);
		*/
		
		
		//Dlc dead = new Dlc();
		//dead.setNovoPersonagem("Springtrap");
		//Dlc smash = new Dlc();
		//smash.setNovoPersonagem("Sans");
		
		//em.persist(dead);
		//em.persist(smash);
		
		/*
		Jogo jogo = new Jogo();
		jogo.setNomeJogo("Dead by Daylight");
		jogo.setCriadorJogo("David Richard");
		jogo.setEmpresaJogo("Behaviour Interactive");
		jogo.setGeneroJogo(GeneroJogo.TERROR);
		jogo.setPreco(new BigDecimal(149));
		jogo.getDlc().add(dead);
		*/
		//em.persist(jogo);
		/*
		Jogo jogo2 = new Jogo();
		jogo2.setNomeJogo("Super Smash Bros. Ultimate");
		jogo2.setCriadorJogo("Masahiro Sakurai");
		jogo2.setEmpresaJogo("Nintendo");
		jogo2.setGeneroJogo(GeneroJogo.LUTA);
		jogo2.setPreco(new BigDecimal(332));
		jogo2.getDlc().add(smash);
		
		em.persist(jogo2);
		/*
		
		
		
		
		
		/*
		Filme filme = new Filme();
		filme.setNomeFilme("Se Beber, Não Case!");
		filme.setDiretorFilme("Todd Phillips");
		filme.setDataEstreia("21/08/2009");
		filme.setGeneroFilme(GeneroFilme.COMEDIA);
		filme.setClassificacaoFilme(14);
		
		em.persist(filme);
		 */
		/*
		Filme filme2 = new Filme();
		filme2.setNomeFilme("Se Beber, Não Case! Parte II");
		filme2.setDiretorFilme("Todd Phillips");
		filme2.setDataEstreia("27/05/2011");
		filme2.setGeneroFilme(GeneroFilme.COMEDIA);
		filme2.setClassificacaoFilme(16);
		
		em.persist(filme2);
		
		Filme filme3 = new Filme();
		filme3.setNomeFilme("Se Beber, Não Case! Parte III");
		filme3.setDiretorFilme("Todd Phillips");
		filme3.setDataEstreia("31/05/2013");
		filme3.setGeneroFilme(GeneroFilme.COMEDIA);
		filme3.setClassificacaoFilme(14);
		
		em.persist(filme3);
		
		/*
		Usuario usuario = new Usuario();
		usuario.setNome("Luccas");
		usuario.setTelefone("46376857948");
		usuario.setEmail("email@gmail.com");
		
		em.persist(usuario);
		*/
		
		Serie serie = new Serie();
		serie.setNomeSerie("Wakfu");
		serie.setProducaoSerie("Ankama Animation");
		serie.setNumeroTemporadas(3);
		serie.setGeneroSerie(GeneroSerie.AVENTURA);
		
		
		
		em.persist(serie);
		/*
		Serie serie2 = new Serie();
		serie2.setNomeSerie("Arcane");
		serie2.setProducaoSerie("Fortiche Production");
		serie2.setNumeroTemporadas(1);
		serie2.setGeneroSerie(GeneroSerie.AÇÃO);
		serie2.setUsuario(usuario);
		
		em.persist(serie2);
		*/
		
		/*
		Anime anime = new Anime();
		anime.setNomeAnime("Gintama");
		anime.setAutorManga("Hideaki Sorachi");
		anime.setEstudioAnime("Sunrise/BNP");
		anime.setGeneroAnime(GeneroAnime.SHOUNEN);
		
		em.persist(anime);
		*/
		
		System.out.println("Feito");
		
		em.close();
		emf.close();
	}

}
