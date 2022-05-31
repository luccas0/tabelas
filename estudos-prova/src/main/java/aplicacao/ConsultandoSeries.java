package aplicacao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Serie;
import dominio.Usuario;



public class ConsultandoSeries {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudos-prova");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin(); // há a necessidade de se fazer uma transação ao inserir algo no bd
		

		// Quando consultamos veículos, o provedor JPA executa uma consulta do proprietário para cada veículo encontrado:
		
		List<Serie> series = em.createQuery("select s from Serie s", Serie.class).getResultList();
		for (Serie serie : series) {
			System.out.println(serie.getProducaoSerie() + " - " + serie.getUsuario().getNome());

		}
		
		
		// Se consultarmos um veículo pelo identificador, a query inclui um left join ou inner join com a tabela de proprietários, dependendo do que foi definido no atributo optional do mapeamento @OneToOne.
		Serie serie = em.find(Serie.class, 1L);
		System.out.println(serie.getProducaoSerie() + " - " + serie.getUsuario().getNome());
		
		// Agora podemos consultar um proprietário e obter o veículo dele.
		Usuario usuario = em.find(Usuario.class, 2L);
		System.out.println(usuario.getSeries() + " - " + usuario.getNome());
		
		
		em.getTransaction().commit();

		System.out.println("pronto!");
		em.close(); // fechando...
		emf.close();


	}

}
