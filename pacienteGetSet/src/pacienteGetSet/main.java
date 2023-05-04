package pacienteGetSet;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in); 

        System.out.println("Digite seu Nome:");
        String nome = in.nextLine();

        System.out.println("Digite a Idade:");
        String idade = in.next();


        System.out.println("Digite sua Altura:");
        double altura = in.nextDouble();
        System.out.println("Digite seu Peso:");
        double peso = in.nextDouble();

        Paciente p1 = new Paciente(nome, idade,altura, peso);
        p1.apresentarPaciente();

        System.out.println("Nome:");
        String nome2 = in.next();

        System.out.println("Idade:");
        String idade2 = in.next();


        System.out.println("Altura:");
        double altura2 = in.nextDouble();
        System.out.println("Peso:");
        double peso2 = in.nextDouble();

        Paciente p2 = new Paciente(nome2, idade2,altura2, peso2);
        p2.apresentarPaciente();
	}
}