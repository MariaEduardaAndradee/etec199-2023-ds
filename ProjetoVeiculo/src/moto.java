
public class moto extends veiculo {
	
	private double cilindrada;

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public void exibirMoto(String Marca) {
		System.out.println("/nMarca: "+getMarca()+"/nModelo"+getModelo()+"/nAno"+getAno()+"/nCor"+getCor()+"/nCilindrada"+getCilindrada());
	}

	public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println();
    }
}
