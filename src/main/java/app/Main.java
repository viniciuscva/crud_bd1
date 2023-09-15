package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Aluno;

public class Main {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("111", "Joao", "joao@email.com");
		Aluno a2 = new Aluno("112", "Maria", "maria@email.com");a2 = new Aluno("112", "Maria", "maria@email.com");
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("crud");
		EntityManager em = emf.createEntityManager();
		
//		em.getTransaction().begin();
//		em.persist(a1);
//		em.persist(a2);
//		em.getTransaction().commit();
		
//		Aluno a = em.find(Aluno.class, "111");
//		System.out.println(a);
		
//		em.getTransaction().begin();
//		em.remove(a);
//		em.getTransaction().commit();
		
//		Aluno modified = new Aluno("112", "Maria", "marianovoemail@email.com");
//		em.getTransaction().begin();
//		em.merge(modified);
//		em.getTransaction().commit();
//		
//		System.out.println("Pronto!");
//		em.close();
//		emf.close();
		
//		Aluno a1 = new Aluno("111", "Joao", "joao@email.com");
//		Aluno a2 = new Aluno("112", "Maria", "maria@email.com");
//		AlunoDAO alunoDAO = AlunoDAO.getInstance();
//		alunoDAO.persist(a1);
//		alunoDAO.persist(a2);
		//Aluno a = alunoDAO.getByMatricula("111");
		//a1.setEmail("joao@novoemail.com");
		//alunoDAO.update(a1);
//		Aluno a = alunoDAO.getFirstByNome("Mar");
//		System.out.println(a.getMatricula());
//		alunoDAO.removeByMatricula(a.getMatricula());
//		alunoDAO.close();
		
//		Aluno2 a = new Aluno2();
//		a.setNome("Ferreira");
//		a.setEmail("email");
//		em.getTransaction().begin();
//		em.persist(a);
//		em.getTransaction().commit();
//		em.close();
		
		
		
		
		System.out.println("Fim!");
	}

}
