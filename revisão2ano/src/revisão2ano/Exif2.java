package revisão2ano;

import java.util.Scanner;

public class Exif2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in); 
		int numero = 2; 

			System.out.println("informe o valor: "); 
			numero = entrada.nextInt(); 

				if (numero %2 == 0) { 
				System.out.println ("Seu numero é par!"); 
				} 

				else { 
				System.out.println("Seu número é impar!"); 
				}
	
			System.out.println("FIM");
	}

}
