package aplicacao;

import entidades.Lista;
import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		Lista lista = new Lista();
		
		// adicionar os produtos na lista
		/*
		 * verificacao de duplicados: verifica se tem algum produto com o mesmo binomio (nome,preco) na lista.
		 * Se tiver, ele nao adiciona
		 */
		lista.addProduto(new Produto("Faca", 1200.0f));
		lista.addProduto(new Produto("Celular", 4500.0f));
		lista.addProduto(new Produto("Lapis", 120.0f));
		lista.addProduto(new Produto("Lapis", 120.0f));
		lista.addProduto(new Produto("Computador", 5265.6f));
		lista.addProduto(new Produto("Faca", 1200.0f));
		
		lista.mostarLista();
		
		lista.ordenarLista();
		
		System.out.println("\nLista ordenada[nome]:");
		lista.mostarLista();
	}

}
