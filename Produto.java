package teste1;

public class Produto {
	private int qtdEstoque;
	private float pVenda;
	private float pCusto;
	private String dataUltimaCompraEstoque;
	Fornecedor fc;
	public static int numeroDeProdutos = 0;

	public Produto(int qtdEstoque, float pVenda, float pCusto, String data, Fornecedor fc) {
		this.qtdEstoque = qtdEstoque;
		this.pVenda = pVenda;
		this.pCusto = pCusto;
		this.dataUltimaCompraEstoque = data;
		this.fc = fc;
		numeroDeProdutos++;
	}
	
	
	
}
