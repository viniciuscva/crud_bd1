package app;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Aluno;
import dominio.Aluno2;
import dominio.AlunoDAO;

public class Main {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("113", "Joao", "joao@email.com");
		Aluno a2 = new Aluno("114", "Maria", "maria@email.com");
		
		Aluno2 a = new Aluno2();
		a.setNome("Ferreira");
		ArrayList<String> emails = new ArrayList<String>();
		emails.add("email1"); emails.add("email50");
		a.setEmails(emails);
		
		Aluno2 b = new Aluno2();
		b.setNome("Garcia");
		ArrayList<String> emails2 = new ArrayList<String>();
		emails2.add("emailemail"); emails2.add("eee"); emails2.add("aaa");
		b.setEmails(emails2);
		
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
		
		
		em.getTransaction().begin();
		em.persist(b);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		
		
		
		System.out.println("Fim!");
	}

}
