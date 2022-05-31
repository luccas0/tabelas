package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Usuario;
import dominio.Serie;


public class BuscandoUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudos-prova");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin(); // há a necessidade de se fazer uma transação ao inserir algo no bd

		Usuario usuario = em.find(Usuario.class, 2L);
		
		System.out.println("Usuario: " + usuario.getNome());
		
		for (Serie serie : usuario.getSeries()) {
		System.out.println("Serie: " + serie.getProducaoSerie());
		}

		em.getTransaction().commit();

		System.out.println("pronto!");
		em.close(); // fechando...
		emf.close();
	}

}
