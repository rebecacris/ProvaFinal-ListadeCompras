package entidades;

public class Produto implements Comparable<Produto>{
	private String nome;
	private float preco;
	
	public Produto() {
	}
	
	public Produto(String nome, float preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public float getPreco() {
		return preco;
	}
	
	
	// ORDENACAO POR NOME (ORDEM ALFABETICA)
	@Override
	public int compareTo(Produto o) {
		if (this.nome.charAt(0) > o.getNome().charAt(0)) {
			return 1;
		}
		if (this.nome.charAt(0) < o.getNome().charAt(0)) {
			return -1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + "/ Preco: " + preco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + Float.floatToIntBits(preco);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Produto))
			return false;
		Produto other = (Produto) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		}
		else if (!nome.equals(other.nome))
			return false;
		if (Float.floatToIntBits(preco) != Float.floatToIntBits(other.preco))
			return false;
		return true;
	}
	
}
