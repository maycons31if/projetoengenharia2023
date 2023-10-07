package control;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Aluno;
import java.util.List;

public class AlunoControle {
	private EntityManager em;

	public AlunoControle (){
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("library");
		em=emf.createEntityManager();
		
		
	}
	

	
	public void inserir(Aluno obj) {
		
		  try {
	            em.getTransaction().begin();
	            em.persist(obj);
	            em.getTransaction().commit();
	         } catch (Exception ex) {
	            ex.printStackTrace();
	            em.getTransaction().rollback();
	         }

		
	}
	
	public void alterar(Aluno obj) {
		
	    try {
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }

		
	}
	
	public void excluir(Aluno obj) {
		
	     try {
	            em.getTransaction().begin();
	            em.remove(obj);
	            em.getTransaction().commit();
	         } catch (Exception ex) {
	            ex.printStackTrace();
	            em.getTransaction().rollback();
	         }

		
	}
	
	public void excluirPorId(Integer Id) {
		
		  try {
			  	Aluno obj = buscarPorId(Id);
	            excluir(obj);
	         } catch (Exception ex) {
	            ex.printStackTrace();
	         }

		
	}

	public Aluno buscarPorId(Integer id) {

		return em.find(Aluno.class, id);
		
	}
	
	
	public List<Aluno> buscarTodos() {
		
		String nomeClasse = Aluno.class.getName();
		return em.createQuery("FROM " + nomeClasse).getResultList();
		
	}
	
	
}
