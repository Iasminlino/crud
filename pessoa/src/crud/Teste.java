package crud;

import repositorio.RepositorioPessoaFisica;
import repositorio.RepositorioPessoaJuridica;

public class Teste {

	public static void main(String[] args) {
		testaPJ();
        testaPF();
	}

	private static void testaPF() {
		RepositorioPessoaFisica cpf = new RepositorioPessoaFisica();
		String cpfApagar="23566578411";

		PessoaFisica aluno1 = new PessoaFisica();
		aluno1.setCpf("12895023544");
		aluno1.setNome("Iasmin");

		PessoaFisica aluno2 = new PessoaFisica();
		aluno2.setCpf("23566578411");
		aluno2.setNome("Isabella");

		cpf.inseri(aluno1);
		cpf.inseri(aluno2);

		System.out.println("Lista");
		for (int i = 0; i < cpf.retornaLista().size(); i++) {
			PessoaFisica pf = (PessoaFisica) cpf.retornaLista().get(i);
			System.out.println("*********************");
			System.out.println("cpf: " + pf.getCpf() + "\n");
			System.out.println("nome: " + pf.getNome() + "\n");
		}

		aluno1.setNome("Iasmin Lino");

		if (cpf.atualiza(aluno1)) {
			for (int i = 0; i < cpf.retornaLista().size(); i++) {
				PessoaFisica pf = (PessoaFisica) cpf.retornaLista().get(i);
				System.out.println("------------------------");
				System.out.println("cpf: " + pf.getCpf() + "\n");
				System.out.println("nome: " + pf.getNome() + "\n");
			}
		}

		
		if (cpf.apaga(cpfApagar)) {
			System.out.println("pessoa fisica apagada - cpf: " + cpfApagar );
		} else {
			System.out.println("pessoa fisica não encontrada");
		}

		System.out.println("Lista Atualizada");
		for (int i = 0; i < cpf.retornaLista().size(); i++) {
			PessoaFisica pf = (PessoaFisica) cpf.retornaLista().get(i);
			System.out.println("*********************");
			System.out.println("cpf: " + pf.getCpf() + "\n");
			System.out.println("nome: " + pf.getNome() + "\n");
		}

	}

	private static void testaPJ() {
		RepositorioPessoaJuridica cnpj = new RepositorioPessoaJuridica();
		String cnpjApagar="86.456.952/0001-63";

		PessoaJuridica pj1 = new PessoaJuridica();
		pj1.setCnpj("13.578.981/0001-09");
		pj1.setNome("Primeira empresa");

		PessoaJuridica pj2 = new PessoaJuridica();
		pj2.setCnpj("86.456.952/0001-63");
		pj2.setNome("Segunda empresa");

		cnpj.inseri(pj1);
		cnpj.inseri(pj2);

		System.out.println("Lista");
		for (int i = 0; i < cnpj.retornaLista().size(); i++) {
			PessoaJuridica pj = (PessoaJuridica) cnpj.retornaLista().get(i);
			System.out.println("*********************");
			System.out.println("cpf: " + pj.getCnpj() + "\n");
			System.out.println("nome: " + pj.getNome() + "\n");
		}

		pj1.setNome("Empresa 01 - Atualizada");

		if (cnpj.atualiza(pj1)) {
			for (int i = 0; i < cnpj.retornaLista().size(); i++) {
				PessoaJuridica pj = (PessoaJuridica) cnpj.retornaLista().get(i);
				System.out.println("------------------------");
				System.out.println("cpf: " + pj.getCnpj() + "\n");
				System.out.println("nome: " + pj.getNome() + "\n");
			}
		}


		if (cnpj.apaga(cnpjApagar)) {
			System.out.println("pessoa juridica apagada - cnpj: "+ cnpjApagar);
		} else {
			System.out.println("pessoa juridica não encontrada");
		}

		System.out.println("\n\n\n Lista Atualizada");
		for (int i = 0; i < cnpj.retornaLista().size(); i++) {
			PessoaJuridica pj = (PessoaJuridica) cnpj.retornaLista().get(i);
			System.out.println("*********************");
			System.out.println("cpf: " + pj.getCnpj() + "\n");
			System.out.println("nome: " + pj.getNome() + "\n");
		}
	}
	}

