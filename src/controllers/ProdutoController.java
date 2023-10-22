package controllers;

import java.util.Scanner;
import java.util.UUID;

import entities.Categoria;
import entities.Produto;
import repositories.ProdutoRepository;

public class ProdutoController {

	public void cadastrarProduto() {

		try {
			System.out.println("\n CADASTRO DE PRODUTO \n");

			Produto produto = new Produto();

			produto.setCategoria(new Categoria());

			produto.setId(UUID.randomUUID());

			Scanner scanner = new Scanner(System.in);
			System.out.print("NOME DO PRODUTO...: ");
			produto.setNome(scanner.nextLine());
			System.out.print("DESCRICAO...................: ");
			produto.setDescricao(scanner.nextLine());
			System.out.print("PRECO.............: ");
			produto.setPreco(scanner.nextLine());
			System.out.print("QUANTIDADE...............: ");
			produto.setQuantidade(Double.parseDouble(scanner.nextLine()));
			System.out.print("CODIGO...............: ");
			produto.setCodigo(Double.parseDouble(scanner.nextLine()));
			System.out.print("DESCRICAO...................: ");
			produto.setDescricao(scanner.nextLine());

			ProdutoRepository produtoRepository = new ProdutoRepository();
			produtoRepository.exportarParaTxt(produto);

			scanner.close();
		} catch (Exception e) {

			System.out.println("\nFALHA AO CADASTRAR PRODUTO!");
			System.out.println("\nERRO: " + e.getMessage());
		}
	}
}