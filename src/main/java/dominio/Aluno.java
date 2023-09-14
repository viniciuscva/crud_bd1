package dominio;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
// @Table(name = "Aluno")
public class Aluno {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String matricula;
	//@Column
	//@Column(name = "nome", length = 128, nullable = false, unique = true)
	private String nome;
	private String email;
	
	public Aluno() {}

	public Aluno(String matricula, String nome, String email) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
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
