package repositorio;

import java.util.List;
import crud.Pessoa;

public interface RepositorioCRUD {
	
	public boolean atualiza(Pessoa pessoa);
	public boolean inseri(Pessoa pessoa);
	public boolean apaga(String identificador);
	public List<?> retornaLista();
}
