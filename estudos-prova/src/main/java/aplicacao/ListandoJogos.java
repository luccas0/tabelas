package aplicacao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dominio.Jogo;



public class ListandoJogos {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudos-prova");
		EntityManager em = emf.createEntityManager();

		 em.getTransaction().begin(); // há a necessidade de se fazer uma transação ao inserir algo no bd

		Query query = em.createQuery("select j from Jogo j");
		
		List<Jogo> jogos = query.getResultList();
		for (Jogo jogo : jogos) {
			System.out.println(jogo.getCodigoJogo() + " - " 
					+ jogo.getNomeJogo() + " " 
					+ jogo.getCriadorJogo() + ", " 
					+ jogo.getEmpresaJogo() + ", " 
					+ jogo.getGeneroJogo() + " por " 
					+ "R$"+ jogo.getPreco());
		}

		 em.getTransaction().commit();

		System.out.println("pronto!");
		em.close(); // fechando...
		emf.close();

	}

}
