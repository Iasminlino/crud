/**
 * 
 */
package crud;

/**
 * @author iasmi
 *
 */
public class PessoaJuridica extends Pessoa {
	private String cnpj;  

	public PessoaJuridica() {
	   super();
	}

	// Getter e setter para cnpj

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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
