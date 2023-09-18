package view;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//n�o existe essa classe no package Model

public class Livro {
	public Livro(String string, String string2, String string3, String string4, String string5, String string6,
			String string7, String string8) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		//O nome da sua classe est� incorreta. Deveria se chamar Livro
		//Voc� tamb�m n�o criou os construtores na classe livro e Aluno, l� no package Model
		
		Livro v = new Livro( null, "9788533302273", "Programacao Java", "2", "IFTM", "portugues", "1", "2023");
		Livro v1 = new Livro( null, "0088533302278", "C++", "1", "educa", "ingles", "2", "1990");
		Livro v2 = new Livro( null, "1288533302235", "Cobol", "4", "virtual", "portugues", "3", "1980");
	
		//corrigi os imports, entretanto o nome da persistencia, precisa ser uma String, 
		//ou seja, faltou "", o correto � "library"
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("library");
		EntityManager em = emf.createEntityManager();
		
		
		em.getTransaction().begin();
		em.persist(v);
		em.persist(v1);
		em.persist(v2);
		em.getTransaction().commit();
		
	
		
	}
}