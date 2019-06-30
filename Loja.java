package teste1;

import java.util.List;

public class Loja {
	public String nome;
	public String endereco;
	public String bairro;
	public String cidade;
	private String estado;
	private List<Produto> listaProdutos;
	private int nProdutos= 0;
	public static int nLojas = 0;
	
	public Loja(String nome, String endereco, String bairro, String cidade,String estado) {
		this.nome = nome;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		nLojas++;
	}

	public void addProduto(Produto pd) {
		listaProdutos.add(pd);
		this.nProdutos++;
	}
	
	public String toString() {
		return "Nome:" + nome + " Endereço: " + endereco + " Bairro: " + bairro + " Cidade: " + " Estado:" + estado;
	}
	
	public void numeroDeLojas() {
		System.out.println("Numero de Lojas: " + nLojas);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
