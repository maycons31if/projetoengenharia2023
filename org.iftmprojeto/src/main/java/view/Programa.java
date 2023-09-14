package view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.TelaLivro;

public class Programa {
	public static void main(String[] args) {
	
	TelaLivro v = new TelaLivro( "9788533302273", "Programacao Java", "2", "IFTM", "portugues", "1", "2023");
	TelaLivro v1 = new TelaLivro( "0088533302278", "C++", "1", "educa", "ingles", "2", "1990");
	TelaLivro v2 = new TelaLivro( "1288533302235", "Cobol", "4", "virtual", "portugues", "3", "1980");
	
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(library);
		EntityManager em = emf.createEntityManager();
		
		
		em.getTransaction().begin();
		em.persist(v);
		em.persist(v1);
		em.persist(v2);
		em.getTransaction().commit();
		
		
		
	}
}