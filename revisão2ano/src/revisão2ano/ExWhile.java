package revisão2ano;

import java.util.Scanner;

public class ExWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		String resposta = "S";
		String resposta2 = "S";
		
		while (resposta.equals(resposta2)) {
			
			System.out.println("Informe sua senha");
			int senha = entrada.nextInt();

			
			if (senha == 2002) {
				System.out.println("Acesso Permitido");
				System.out.println("FIM");

				
			}	else	{
				System.out.println("Senha inválida");
				System.out.println("Digite Novamente");
			}
				
				resposta2 = entrada.next();
		}
		
		System.out.println("FIM");

	}

}
