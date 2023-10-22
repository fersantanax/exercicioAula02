package repositories;

import java.io.PrintWriter;

import entities.Produto;

public class ProdutoRepository {

	public void exportarParaTxt(Produto produto) {
		try {

			PrintWriter printWriter = new PrintWriter("c:\\temp\\produto_" + produto.getId() + ".txt");

			printWriter.write("\nID DO PRODUTO..: " + produto.getId());
			printWriter.write("\nNOME...............: " + produto.getNome());
			printWriter.write("\nDESCRICAO................: " + produto.getDescricao());
			printWriter.write("\nPRECO..........: " + produto.getPreco());
			printWriter.write("\nQUANTIDADE............: " + produto.getQuantidade());
			printWriter.write("\nCODIGO............: " + produto.getCodigo());
			printWriter.write("\nDESCRICAO................: " + produto.getDescricao());

			printWriter.flush();
			printWriter.close();
			System.out.println("\nARQUIVO TXT GRAVADO COM SUCESSO!");

		} catch (Exception e) {
			System.out.println("\nFALHA AO GRAVAR ARQUIVO TXT:");
			System.out.println("\nERRO: " + e.getMessage());

		}
	}
}
