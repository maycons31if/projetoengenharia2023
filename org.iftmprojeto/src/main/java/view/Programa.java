package view;

import java.util.Iterator;
import java.util.List;
import control.AlunoControle;
import model.Aluno;

public class Programa {
	public static void main(String[] args) {
		//inserindo
		Aluno novo = new Aluno(null, "12345678", "Maycon");		
		AlunoControle controle = new AlunoControle();	
		controle.inserir(novo);
		
		//buscando
		novo = controle.buscarPorId(1); //o id 3 precisa existir no banco, modifique o valor
		System.out.println(novo.getNome()); // substitua por um método get do seu projeto
		
		//modificando
		novo.setMatricula ("87654321"); // no seu caso utilize um método set do seu projeto
		controle.alterar(novo);
		
		//buscar todos
		List<Aluno> objetos = controle.buscarTodos();
		for (Iterator iterator = objetos.iterator(); iterator.hasNext();) {
			Aluno obj = (Aluno) iterator.next();
			System.out.println(obj.getId());
		}
		
		//excluir
		controle.excluir(objetos.get(0));
		
		//excluir por id
		controle.excluirPorId(1); //o id 3 precisa existir no banco, modifique o valor	
	}




/*
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
	public static void main(String[] args) {
	
		Aluno v = new Aluno(null, "963852741", "Jose");
		Aluno v1 = new Aluno(null, "852963741", "Maria");
		Aluno v2 = new Aluno(null, "321963987", "Tadeu");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("library");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.Persist(v);
		em.Persist(v1);
		em.Persist(v2);
		em.getTransaction().commit();
		
		/*em.close();
		emf.close();*/
	
	*/
	
	
	}
