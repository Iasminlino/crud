/**
 * 
 */
package repositorio;

import java.util.ArrayList;
import java.util.List;

import crud.Pessoa;
import crud.PessoaJuridica;

/**
 * @author iasmi
 *
 */
public class RepositorioPessoaJuridica implements RepositorioCRUD {
	List<PessoaJuridica> listaPJ = new ArrayList<PessoaJuridica>();

	@Override
	public boolean atualiza(Pessoa pessoa) {
		boolean ok = false;
		PessoaJuridica pj = (PessoaJuridica) pessoa;
		try {
			for (int i = 0; i < listaPJ.size(); i++) {
				if (listaPJ.get(i).getCnpj().equals(pj.getCnpj())) {
					listaPJ.get(i).setNome(pj.getNome());
					ok = true;
				}
			}
		} catch (Exception e) {
			ok = false;
		}

		return ok;
	}

	@Override
	public boolean inseri(Pessoa pessoa) {
		boolean ok = false;
		try {
			listaPJ.add((PessoaJuridica) pessoa);
			ok = true;
		} catch (Exception e) {
			ok = false;
		}
		return ok;
	}

	@Override
	public boolean apaga(String identificador) {
		boolean ok = false;
		try {
			for (int i = 0; i < listaPJ.size(); i++) {
				if (listaPJ.get(i).getCnpj().equals(identificador)) {
					listaPJ.remove(i);
					ok = true;
				}
			}
		} catch (Exception e) {
			ok = false;
		}

		return ok;
	}

	@Override
	public List<?> retornaLista() {
		return listaPJ;
	}

}
