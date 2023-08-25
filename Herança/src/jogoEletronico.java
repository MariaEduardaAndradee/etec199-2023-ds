
public class jogoEletronico extends jogo{

	public String plataforma;
	public String genero;
	
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void exibirInformacoes() {
        System.out.println("Plataforma: " 		+ 	  this.getPlataforma());
        System.out.println("Gênero: " 		 	+ 	  this.getGenero());
       
	}
	
}
