package aplicacao;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Jogo;



public class AtualizandoJogo {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudos-prova");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin(); // há a necessidade de se fazer uma transação ao inserir algo no bd

		Jogo jogo = em.find(Jogo.class, 22L);
		
		System.out.println("Valor sem desconto: " + jogo.getPreco());
		jogo.setPreco(jogo.getPreco().add(new BigDecimal(-132)));
		System.out.println("Valor com desconto: " + jogo.getPreco());

		em.getTransaction().commit();

		System.out.println("pronto!");
		em.close(); // fechando...
		emf.close();

	}

}
