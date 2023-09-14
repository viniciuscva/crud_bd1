package dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Alunos2")
public class Aluno2 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int matricula;
	//@Column
	//@Column(name = "nome", length = 128, nullable = false, unique = true)
	private String nome;
	private String email;
	
	public Aluno2() {}

	public Aluno2(int matricula, String nome, String email) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", email=" + email + "]";
	}
	
	
}
