package com.fiap.luccas.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Singleton {
	
	//1-Atributo est�tico que armazena a �nica inst�ncia
		private static EntityManagerFactory fabrica;
		
		//2-Construtor privado
		private Singleton () {}
		
		//3-M�todo est�tico que cria e retorna a �nica inst�ncia
		public static EntityManagerFactory getInstance() {
			if (fabrica == null) {
				fabrica = Persistence.createEntityManagerFactory("estudos-prova");
			}
			return fabrica;
		}

}
