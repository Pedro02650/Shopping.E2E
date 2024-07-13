package produtos;

public class Produto {
	

private	String nome;
private	String descrição;
private	double preço;
private	int quantidade;

public  Produto(String nome, String descrição, double preço, int qtd) {

	this.nome = nome;
	this.descrição = descrição;
	this.preço = preço;
	this.quantidade = qtd;
	
}

public void setQTD (int qtd) {
	
	this.quantidade = qtd;
	
}

public int getQTD (int qtd) {
	
	
	qtd= this.quantidade;
	return qtd;
	
}

public void setPreco(double preco) {
	
	this.preço = preco;
	
}

public double getPreco(double valor) {
	
	valor = this.preço;
	return valor;
	
}

public String toString() {
	
	//String preço = Double.toString(this.preço);
	
	return  "Produto {" +
            "Nome: '" + nome + '\'' +
            ", Descricao: '" + descrição + '\'' +
            ", R$: " + preço +
            ", Qtd: " + quantidade +
            '}';
}
}
