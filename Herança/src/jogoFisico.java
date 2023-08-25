
public class jogoFisico extends jogo{

	public int quantidadeJogadores;
	public double tempoPartida;
	public double tempoTotalJogo;
	
	public int getQuantidadeJogadores() {
		return quantidadeJogadores;
	}
	public void setQuantidadeJogadores(int quantidadeJogadores) {
		this.quantidadeJogadores = quantidadeJogadores;
	}
	public double getTempoPartida() {
		return tempoPartida;
	}
	public void setTempoPartida(double tempoPartida) {
		this.tempoPartida = tempoPartida;
	}
	
	public double calcularTempoTotal (int quantidadePartida, double tempoPartida) {
		return tempoTotalJogo = tempoPartida * quantidadePartida;
	}
	
	public double getTempoTotalJogo() {
		return tempoTotalJogo;
	}
	public void setTempoTotalJogo(double tempoTotalJogo) {
		this.tempoTotalJogo = tempoTotalJogo;
	}
	
	public void exibirInformacoes() {
        System.out.println("Quantidade de Jogadores: " 		+ 	  this.getQuantidadeJogadores());
        System.out.println("Tempo de Partida: " 		 	+ 	  this.getTempoPartida());
        System.out.println("Tempo Total do Jogo: " 			+ 	  this.getTempoTotalJogo());
       
	}
	
	
}
