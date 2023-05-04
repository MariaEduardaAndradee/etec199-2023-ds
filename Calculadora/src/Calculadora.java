public class Calculadora {
		
    private String nome;
    private double resultado;   
    private double resultadoSubtração;

   
    public String getNome() {
        return this.nome;
    }
    
    public String setNome() {
        return this.nome;
    }
    
    public double getResultado() {
        return this.resultado;
    }

    public double getResultadoSubtração() {
        return resultadoSubtração;
    }

    public void setResultadoSubtração(double resultadoSubtração) {
        this.resultadoSubtração = resultadoSubtração;
    }
    
    	public double setResultado(double v1, double v2) { 
    		this.resultado = v1 + v2;
    		return resultado;
       }
    
    	public double setResultadoMenos(double v1, double v2) { 
    		this.resultado = v1 - v2;
            return resultado;
       }

     public void Imprimir () {
         System.out.println(getResultado() );
       }

     public void Subtracao(double[] vet) {
        this.resultadoSubtração = vet[1];
       for (int i = 0; i<5 ;i++) {
       this.resultadoSubtração -= vet[i];
        }
       }

     
     public void Soma(double[] vet) {
        this.resultado = 0;
       for (int i = 0; i<5 ;i++) {
       this.resultado += vet[i];
       }
       
  }
}