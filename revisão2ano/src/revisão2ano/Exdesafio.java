package revisão2ano;

import java.util.Scanner;

public class Exdesafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in); 
		
		String resposta = "S";
		String resposta2 = "S";
		
		while (resposta.equals(resposta2)) {
		
			System.out.println("Informe seu nome");
			String nome = entrada.next();
			
			System.out.println("Informe o ano de seu nascimento");
			int nasc = entrada.nextInt();
		
			System.out.println("Informe o ano atual");
			int atual = entrada.nextInt();
		
			//calculo idade
			int idade = atual - nasc ;
			
				if (idade < 18) {
					System.out.println("Sua idade é " + idade);
					System.out.println("Menor Infrator safado");
					
				}
				else {
					System.out.println("Sua idade é " + idade);
					System.out.println("Pode ser preso ja em");
				}
				
			System.out.println("Deseja continuar S/N?");

			resposta2 = entrada.next();
		}
		System.out.println("FIM");

	}

}
