package teste1;

public class Fornecedor {
	String nome;
	String telefone;
	String CNPJ;
	
	public Fornecedor(String nome, String telefone, String cnpj) {
		this.nome = nome;
		this.telefone = telefone;
		this.CNPJ = cnpj;
	}

	public String toString() {
		return "Nome: " + nome + " Telefone: " + telefone + " CNPJ: " + CNPJ;
	}
}
