package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OrderColumn;
import javax.persistence.Table;


//@Table(name = "Alunos2")
@Entity
@Table(name="Aluno2")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
public class Aluno2 implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int matricula;
	//@Column
	//@Column(name = "nome", length = 128, nullable = false, unique = true)
	public String nome;
	
	@ElementCollection
    @OrderColumn(name = "emailscolumn")
    public List<String> emails;
	
	public Aluno2() {}

	public Aluno2(int matricula, String nome, ArrayList<String> emails) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.emails = emails;
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

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(ArrayList<String> emails) {
		this.emails = emails;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", email=" + emails + "]";
	}
	
	
}
