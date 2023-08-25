
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		moto moto1 = new moto();
		
		moto1.setAno(2018);
		moto1.setCor("Azul");
		moto1.setMarca("Honda");
		moto1.setModelo("XRE 300");
		moto1.setCilindrada(291.6);
		moto1.exibirInformacoes();
		
		carro carro1 = new carro();
		
		carro1.setAno(2020);
		carro1.setCor("Preto");
		carro1.setMarca("Renault");
		carro1.setModelo("Duster");
		carro1.setQntPortas(4);
		carro1.exibirInformacoes();
		
		
		
	}

}
