
public class jogo {
	
	public String nome;
	public double preco;
	public String distribuidora;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDistribuidora() {
		return distribuidora;
	}
	
	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}
	
	public void exibirInformacoes() {
        System.out.println("Nome: " 		 	+ 	  this.getNome());
        System.out.println("Preço: " 		 	+ 	  this.getPreco());
        System.out.println("Distribuidora: " 	+ 	  this.getDistribuidora());
       
	}
	
}
