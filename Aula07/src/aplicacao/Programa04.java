package aplicacao;

import entidade.Produto;

public class Programa04 {

	public static void main(String[] args) {

		Produto produto = new Produto("Teclado", 70, 100);
		
		System.out.println("Nome: " + produto.getNome());
		
		// PARA ALTERAR O PREÇO
		/*
		double precoAtual = produto.getPreco();
		double novoPreco = precoAtual - (precoAtual * 0.1);
		produto.setPreco(novoPreco);
		*/
		
		produto.setPreco(-99);
		System.out.println("Preço: " + produto.getPreco());
		
	}

}
