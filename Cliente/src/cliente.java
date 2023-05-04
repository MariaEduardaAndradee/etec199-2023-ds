
public class cliente {
	private String nome;
	private String endereco;
	private int idade;
	private double valorPedido;
	private double valorPromocional;
	protected double valorDesconto;
	
	
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
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getValorPedido() {
		return valorPedido;
	}
	public void setValorPedido(double valorPedido) {
		this.valorPedido = valorPedido;
	}
	public double getValorPromocional() {
		return valorPromocional;
	}
	
	public void setValorPromocional(double valorPromocional) {
		this.valorPromocional = valorPromocional;
	}

	public double getValorDesconto() {
		return valorDesconto;
	}
	
	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	
	public double calculaDesconto(){
        return valorDesconto = valorPedido * 0.1;
    }
	
	public void exibirInformacoes() {
        System.out.println("Nome: " 		 +    nome);
        System.out.println("Endereço: " 	 +    endereco);
        System.out.println("Idade: " 		 +    idade);
        System.out.println("Valor Pedido: " 	 +    valorPedido);
        System.out.println("Valor Promocional: " +    valorPromocional);
        System.out.println("Valor com Desconto " +    valorDesconto);
	}	
}
