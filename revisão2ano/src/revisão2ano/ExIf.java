package revisão2ano;

import java.util.Scanner;

public class ExIf {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in)) {
			
			System.out.println("Informe um número");
			int numero1 = entrada.nextInt();
			
				if (numero1 < 0) {
					System.out.println("Número Negativo");
				}
				else {
					System.out.println("Número Positivo");
				}
				
			System.out.println("FIM");
		
		}
		
	}

}
