package com.fiap.luccas.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Singleton {
	
	//1-Atributo estático que armazena a única instância
		private static EntityManagerFactory fabrica;
		
		//2-Construtor privado
		private Singleton () {}
		
		//3-Método estático que cria e retorna a única instância
		public static EntityManagerFactory getInstance() {
			if (fabrica == null) {
				fabrica = Persistence.createEntityManagerFactory("estudos-prova");
			}
			return fabrica;
		}

}
