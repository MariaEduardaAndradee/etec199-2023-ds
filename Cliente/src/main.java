
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cliente cliente1 = new cliente();
		
		cliente1.setNome("Darda");
		cliente1.setEndereco("Guaianases");
		cliente1.setIdade(35);
		cliente1.setValorPedido(35.00);
		cliente1.setValorPromocional(10.00);
		cliente1.calculaDesconto();
		cliente1.exibirInformacoes();
		
		clientePremium clienteP = new clientePremium();
		
		System.out.println("");
		clienteP.setNome("Juma");
		clienteP.setEndereco("Tiradentes");
		clienteP.setIdade(18);
		clienteP.setValorPedido(35.00);
		clienteP.setValorPromocional(10.00);
		clienteP.calculaDesconto();
		clienteP.exibirInformacoes();
	}
}
