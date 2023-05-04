import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			 Calculadora Calc1 = new Calculadora();
			 Scanner entrada = new Scanner (System.in);
		
		double v1 , v2; 
		
         System.out.println("Sem Vetores");
		 System.out.println("");

		
		 System.out.print("Informe o 1° valor:");
		 v1 = entrada.nextDouble();
		 
		 System.out.print("Informe o 2° valor:");
		 v2 = entrada.nextDouble();
		 
		 System.out.println("");
		 System.out.println("O valor da subtraçao é: " + Calc1.setResultadoMenos(v1, v2) + "\n"+"valor da soma é: " + Calc1.setResultado(v1, v2));
		
		 System.out.println("");
         System.out.println("Vetores");
		 System.out.println("");

			
         System.out.print("Informe cinco valores para realizar a soma e subtraçao: \n");
         double vet[] = new double[5];
         for(int i = 0; i<5; i++) {
         System.out.print("Digite o " +(i+1)+"° valor: " );
         vet[i] = entrada.nextDouble();
         }
         Calc1.Soma(vet);
         Calc1.Subtracao(vet);
         
		 System.out.println("");
         System.out.println("O resultado da somas dos valores é  de: "+Calc1.getResultado());
         System.out.println("O resultado da subtraçao dos valores é de: "+Calc1.getResultadoSubtração());

 
	} 

}
