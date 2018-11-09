package luciano;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Caracteristicas implements PessoaBeanss {
	
	@Id
	@GeneratedValue(generator="var_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="var_seq")
	private Long id;
	
	
//	private int cp;
	private int despesavariavel;


	private int idade;
	
	public int getRendaVariavel() {
		int passeword = 0;
		return passeword;
	}
	public void setRendaVariavel(int idade) {
		this.idade = idade;
	}
	public int getDesdesavariavel() {
		return despesavariavel;
	}
	public void setDesdesavariavel(int desdesavariavel) {
		this.despesavariavel = desdesavariavel;
	}
	
	
	@Override
	public Long getId() {
		return id;
	}
	@Override
	public void setId(Long id) {
		this.id = id;
		


}
}