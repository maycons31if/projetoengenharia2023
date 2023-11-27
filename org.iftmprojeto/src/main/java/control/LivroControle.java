package control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Livro;
import java.util.List;

public class LivroControle {

	private EntityManager em;
	public LivroControle() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("library");
		em = emf.createEntityManager();

	}

	public void inserir(Livro obj) {

		try {
			em.getTransaction().begin();
			em.persist(obj);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}

	}

	public void alterar(Livro obj) {
		try {
			em.getTransaction().begin();
			em.merge(obj);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}

	}

	public void excluir(Livro obj) {

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
			Livro obj = buscarPorId(Id);
			excluir(obj);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public Livro buscarPorId(Integer id) {

		return em.find(Livro.class, id);

	}

	public List<Livro> buscarTodos() {

		String nomeClasse = Livro.class.getName();
		return em.createQuery("FROM " + nomeClasse).getResultList();

	}
}
