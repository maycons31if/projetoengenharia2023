package view;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import model.tblivro;

public class Programa {
	public static void main(String[] args) {
	
		tblivro v = new tblivro( "9788533302273", "Programacao Java", "2", "IFTM", "portugues", "1", "2023");
		tblivro v1 = new tblivro( "0088533302278", "C++", "1", "educa", "ingles", "2", "1990");
		tblivro v2 = new tblivro( "1288533302235", "Cobol", "4", "virtual", "portugues", "3", "1980");
	
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(library);
		EntityManager em = emf.createEntityManager();
		
		
		em.getTransaction().begin();
		em.persist(v);
		em.persist(v1);
		em.persist(v2);
		em.getTransaction().commit();
		
		/*Teste commit 2*/
		
	}
}