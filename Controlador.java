package teste1;

import java.util.ArrayList;

public class Controlador {
	
	public static ArrayList<Loja> listaDeLojas= new ArrayList<Loja>();
	public static ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();
	public static ArrayList<Fornecedor> listaDeFornecedores = new ArrayList<Fornecedor>();
	
	public static void addLoja(Loja lj) {
		if(lj != null) {
			listaDeLojas.add(lj);
		}
		else {
			System.out.println("Object is null!!");
		}
	}
	
	public static void addProduto(Produto pd) {
		if(pd != null) {
			listaDeProdutos.add(pd);
		}
		else {
			System.out.println("Object is null!!");
		}
	}		
	
	public static void addFornecedor(Fornecedor fc) {
		if(fc != null) {
			listaDeFornecedores.add(fc);
		}
		else {
			System.out.println("Object is null!!");
		}
	}
}
