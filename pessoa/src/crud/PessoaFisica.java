/**
 * 
 */
package crud;

/**
 * @author iasmi
 *
 */
public class PessoaFisica extends Pessoa {
	private String cpf;

	public PessoaFisica() {
	   super();
	}

	// Getter e setter para cpf
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String getNome() {
		return super.getNome();
	}

	@Override
	public void setNome(String nome) {
		super.setNome(nome);
	}


}
