package view;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Aluno {
	public Aluno(String string, String string2, String string3, String string4, String string5, String string6,
			String string7, String string8) {
	}

	public static void main(String[] args) {
	
		
		Aluno v = new Aluno( null, "123456789", "Marcos", "3432181512", "Rua um 212", "Fisica", "36400000","Diurno");
		Aluno v1 = new Aluno( null, "321654987", "Joao", "3432558911", "Rua dois 121", "Licenciatura", "30121990", "Noturno");
		Aluno v2 = new Aluno( null, "325896471", "Jose", "3532145689", "Rua tres 321", "Computacao", "12122000", "Tarde" );
	
				
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("library");
		EntityManager em = emf.createEntityManager();
		
		
		em.getTransaction().begin();
		em.persist(v);
		em.persist(v1);
		em.persist(v2);
		em.getTransaction().commit();
		
	
		
	}
}