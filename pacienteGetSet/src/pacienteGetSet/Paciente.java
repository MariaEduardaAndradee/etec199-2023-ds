package pacienteGetSet;

public class Paciente {

	private String nome;
	private String idade;
	private static double altura;
	private static double peso;
	private double imc;

	
		public Paciente () {
			this("","", altura, peso);		
		}
		
		public Paciente (String nome, String idade, double altura, double peso) {
			this.nome=nome;
			this.idade= idade;
			Paciente.altura=altura;
			Paciente.peso=peso;
		}
		
			public String getNome() {	
				return nome;
			}
		
			public void setNome(String nome) {
				this.nome=nome;
			}
		
			public String getIdade() {
				return idade;
			}
		
			public void setIdade(String idade) {
				this.idade=idade;
			}
		
			public double getAltura(){
				return altura;
			}
		
			public void setAltura(double altura){
				Paciente.altura=altura;
			}
			
			public double getPeso(){
				return peso;
			}
		
			public void setPeso(double peso){
				Paciente.peso=peso;
			}
		
			public double getImc(){
				imc= peso/(altura*altura);
					return imc;
			}
		
			public void setImc(){
				this.imc= peso/(altura*altura);
			}
			
			public  void apresentarPaciente(){
			
				System.out.println("nome: " + this.getNome());
				System.out.println("idade: " + this.getIdade());
				System.out.println("altura: " + this.getAltura());
				System.out.println("peso: " + this.getPeso());	
				
				
				if (this.getImc() < 18.5)
					System.out.println ("Voce abaixo do peso certo");
				
		        else if ((this.getImc() > 18.5) && (this.getImc() <24.9))
		        	System.out.println ("Voce está no peso certo");
				
		        else if ((this.getImc() > 25.0) && (this.getImc() <29.9))
		        	System.out.println("Voce está acima do peso");
				
		        else if ((this.getImc() > 30.0) && (this.getImc() <34.9))
		        	System.out.println("Voce está com obesidade nivel I");
				
		        else if ((this.getImc() > 35.0) && (this.getImc() <39.9))
		        	System.out.println ("Voce está com obesidade nivel II");
				
		        else if (this.getImc() >= 40)
		        	System.out.print ("Voce esta com obesidade nivel III");
			
		}

	}

