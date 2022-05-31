package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Dlc;
import dominio.Jogo;



public class ConsultandoDlcs {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudos-prova");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin(); // há a necessidade de se fazer uma transação ao inserir algo no bd
		
		Jogo jogo = em.find(Jogo.class, 22L);
		System.out.println("Jogo: " + jogo.getNomeJogo());
		
		for (Dlc dlc :jogo.getDlc()) {
		System.out.println("DLC: " + dlc.getNovoPersonagem());
		}
		
		em.getTransaction().commit();

		System.out.println("pronto!");
		em.close(); // fechando...
		emf.close();

	}

}
