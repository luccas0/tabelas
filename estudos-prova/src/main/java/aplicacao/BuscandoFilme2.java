package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Filme;

public class BuscandoFilme2 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudos-prova");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin(); // há a necessidade de se fazer uma transação ao inserir algo no bd

		Filme filme = em.find(Filme.class, 9L);
		System.out.println("Filme de código " + filme.getCodigoFilme()
		+ " é o filme " + filme.getNomeFilme());

		em.getTransaction().commit();

		System.out.println("pronto!");
		em.close(); // fechando...
		emf.close();

	}

}
