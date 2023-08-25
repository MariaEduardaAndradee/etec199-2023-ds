
public class carro extends veiculo {

	private int qntPortas;

	public int getQntPortas() {
		return qntPortas;
	}

	public void setQntPortas(int qntPortas) {
		this.qntPortas = qntPortas;
	}

	 public void exibirInformacoes() {
	        super.exibirInformacoes();
	        System.out.println("Quantidade de portas: " + qntPortas);
	        System.out.println();
	    }
	}

