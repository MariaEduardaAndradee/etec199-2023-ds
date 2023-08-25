
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		jogo j1 = new jogo();
		j1.setNome("Super Mario Bros");
		j1.setPreco(8.00);
		j1.setDistribuidora("Sega");
		j1.exibirInformacoes();
		System.out.println("");
		
		
		jogoFisico j2 = new jogoFisico();
		j2.setQuantidadeJogadores(0);
		j2.setTempoPartida(0);
		j2.setTempoTotalJogo(0);
		j2.exibirInformacoes();
		System.out.println("");


		jogoEletronico j3 = new jogoEletronico();
		j3.setPlataforma(null);
		j3.setGenero(null);
		j3.exibirInformacoes();
		System.out.println("");

		
	}
}
