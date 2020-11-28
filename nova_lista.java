package entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {
	private List<Produto> lista = new ArrayList<Produto>();
	
	public Lista() {
	}
	
	public List<Produto> getLista(){
		return lista;
	}
	
	public void addProduto(Produto produto) {
		if (!verificarProduto(produto))
			lista.add(produto);
		else
			System.out.printf("Produto %s ja existe na lista!\n", produto.getNome());
	}
	
	public void ordenarLista() {
		Collections.sort(lista);
	}
	
	public boolean verificarProduto(Produto produto) {
		return lista.contains(produto);
	}
	
	public void mostarLista() {
		for (Produto p : lista) {
			System.out.println(p);
		}
	}
}
