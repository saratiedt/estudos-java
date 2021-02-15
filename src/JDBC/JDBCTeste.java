package JDBC;

import java.util.ArrayList;

public class JDBCTeste {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa(4, "Maria", "Cecília", 30, "Vendedora");
		Pessoa pessoaAtualizada = new Pessoa(4, "Maria", "Cecília", 40, "Vendedora");
		PessoaDAO dao = new PessoaDAOJDBC();
		// dao.inserir(pessoa);

		// dao.remover(pessoa);
		dao.atualizar(pessoaAtualizada);
		ArrayList<Pessoa> pessoas = dao.listar();

		for (Pessoa p : pessoas) {
			System.out.println(p.getId() + " " + p.getPrimeiroNome());
		}

	}
}
