package view;

import java.util.Iterator;
import java.util.List;
import control.AlunoControle;
import model.Aluno;
import model.Livro;
import control.LivroControle;

public class Programa {}
/*	public static void main(String[] args) {
		//inserindo
<<<<<<< HEAD

		Aluno novo = new Aluno(null, 12345678, "Maycon", "Ativo", 343218000, 38400000, "Rua do faculdade", 0101111, "Direito", "Noturno");		
=======
		Aluno novo = new Aluno(null, 12345678, "Maycon", "Ativo", 343218000, 38400000, "Rua do faculdade", 1011212, "Direito", "Noturno");		
>>>>>>> branch 'main' of https://github.com/maycons31if/projetoengenharia2023.git
		AlunoControle controle = new AlunoControle();	
		controle.inserir(novo);
		
		// Aluno(Integer id, Integer matricula, String aluno, String situacao, Integer telefone, Integer cep,String endereco, Integer dtnasc, String curso, String turno
		
		
		//buscando
		novo = controle.buscarPorId(1); //o id 3 precisa existir no banco, modifique o valor
		//System.out.println(novo.getNome()); // substitua por um método get do seu projeto
		
		//modificando
<<<<<<< HEAD
		//novo.setMatricula (87654321); // no seu caso utilize um método set do seu projeto
		//controle.alterar(novo);
=======
		novo.setMatricula (87654321); // no seu caso utilize um método set do seu projeto
		controle.alterar(novo);
>>>>>>> branch 'main' of https://github.com/maycons31if/projetoengenharia2023.git
		
		//buscar todos
		List<Aluno> objetos = controle.buscarTodos();
		for (Iterator iterator = objetos.iterator(); iterator.hasNext();) {
			Aluno obj = (Aluno) iterator.next();
			System.out.println(obj.getId());
		}
		
		//excluir
		//controle.excluir(objetos.get(0));
		
		//excluir por id
		//controle.excluirPorId(1); //o id 3 precisa existir no banco, modifique o valor	
<<<<<<< HEAD
=======
	
>>>>>>> branch 'main' of https://github.com/maycons31if/projetoengenharia2023.git
	}
}
<<<<<<< HEAD

=======
>>>>>>> branch 'main' of https://github.com/maycons31if/projetoengenharia2023.git



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
		emf.close();
	
<<<<<<< HEAD
=======
	
	
>>>>>>> branch 'main' of https://github.com/maycons31if/projetoengenharia2023.git
	*/
