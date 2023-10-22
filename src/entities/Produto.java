package entities;

import java.util.UUID;

public class Produto {
	private UUID id;
	private String nome;
	private String descricao;
	private String preco;
	private Integer quantidade;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String string) {
		this.preco = string;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double d, Integer quantidade) {
		this.quantidade = quantidade;
	}

	public void setQuantidade(double parseDouble) {

	}

	public void setCategoria(Categoria categoria) {

	}

	public void setCodigo(double parseDouble) {
		// TODO Auto-generated method stub
		
	}

	public String getCodigo() {
		// TODO Auto-generated method stub
		return null;
	}

}