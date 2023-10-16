package crud;

public class Pessoa {
	 private String nome;
	 public Pessoa() {
		 
	 }

	 public Pessoa(String nome) {
		 super();
	     this.nome = nome;
	 }

	 // Get e set para nome 

	 public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

}
