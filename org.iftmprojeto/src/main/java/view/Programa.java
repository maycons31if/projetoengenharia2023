package view;


import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Persistence;

//não existe essa classe no package Model
import model.tblivro;

public class Programa {
	public static void main(String[] args) {
	
		//O nome da sua classe está incorreta. Deveria se chamar Livro
		//Você também não criou os construtores na classe livro e Aluno, lá no package Model
		tblivro v = new tblivro( "9788533302273", "Programacao Java", "2", "IFTM", "portugues", "1", "2023");
		tblivro v1 = new tblivro( "0088533302278", "C++", "1", "educa", "ingles", "2", "1990");
		tblivro v2 = new tblivro( "1288533302235", "Cobol", "4", "virtual", "portugues", "3", "1980");
	
		//corrigi os imports, entretanto o nome da persistencia, precisa ser uma String, 
		//ou seja, faltou "", o correto é "library"
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