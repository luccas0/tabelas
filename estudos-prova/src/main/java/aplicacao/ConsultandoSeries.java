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

		em.getTransaction().begin(); // h� a necessidade de se fazer uma transa��o ao inserir algo no bd
		

		// Quando consultamos ve�culos, o provedor JPA executa uma consulta do propriet�rio para cada ve�culo encontrado:
		
		List<Serie> series = em.createQuery("select s from Serie s", Serie.class).getResultList();
		for (Serie serie : series) {
			System.out.println(serie.getProducaoSerie() + " - " + serie.getUsuario().getNome());

		}
		
		
		// Se consultarmos um ve�culo pelo identificador, a query inclui um left join ou inner join com a tabela de propriet�rios, dependendo do que foi definido no atributo optional do mapeamento @OneToOne.
		Serie serie = em.find(Serie.class, 1L);
		System.out.println(serie.getProducaoSerie() + " - " + serie.getUsuario().getNome());
		
		// Agora podemos consultar um propriet�rio e obter o ve�culo dele.
		Usuario usuario = em.find(Usuario.class, 2L);
		System.out.println(usuario.getSeries() + " - " + usuario.getNome());
		
		
		em.getTransaction().commit();

		System.out.println("pronto!");
		em.close(); // fechando...
		emf.close();


	}

}
