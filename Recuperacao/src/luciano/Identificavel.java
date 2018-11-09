package luciano;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@SuppressWarnings("serial")
@ViewScoped
@Named
public class Identificavel implements Serializable{
	
	@Inject
	private PessoaBeans service;

	protected Identificavel entidade;

	protected Collection<PessoaBeans> entidades;

	public Identificavel() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newPessoa();
		entidades = newPessoa().getAll();
	}

	private Collection<PessoaBeans> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	private Identificavel newPessoa() {
		// TODO Auto-generated method stub
		return null;
	}

	public void remove(PessoaBeans entidade) {
		getPessoaBeans().remove(entidade);
		limpar();
	}

	private Identificavel getPessoaBeans() {
		// TODO Auto-generated method stub
		return null;
	}

	public Identificavel getEntidade() {
		return entidade;
	}

	public void setEntidade(Identificavel entidade) {
		this.entidade = entidade;
	}

	public Collection<PessoaBeans> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<PessoaBeans> entidades) {
		this.entidades = entidades;
	}

	public void save() {
		getPessoaBeans().save();
		limpar();
	}

	public void editar(Long id) {
		this.getEntidade().setId(id);
		save();
	}

	private void setId(Long id) {
		// TODO Auto-generated method stub
		
	}

	public void limpar() {
		entidades = getPessoaBeans().getAll();
		entidade = newEntidade();
	}

	protected Identificavel newEntidade() {
		return getPessoaBeans();
	}

	public PessoaBeans getService() {
		return service;
	}
	
}

