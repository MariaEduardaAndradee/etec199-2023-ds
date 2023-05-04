package ex1;

import java.util.Scanner;

public class TesteMatematica {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Verifica se um número é primo
System.out.print("Digite um número: ");
int numero = sc.nextInt();
if (Matematica.isPrimo(numero)) {
System.out.println(numero + " é primo");
} else {
System.out.println(numero + " não é primo");
}

// Verifica se vários números são primos
System.out.print("Digite um conjunto de números separados por espaço: ");
sc.nextLine(); // limpa o buffer do scanner
String numerosStr = sc.nextLine();
String[] numerosStrArr = numerosStr.split(" ");
int[] numeros = new int[numerosStrArr.length];
for (int i = 0; i < numerosStrArr.length; i++) {
numeros[i] = Integer.parseInt(numerosStrArr[i]);
}
boolean[] resultados = Matematica.isPrimo(numeros);
for (int i = 0; i < resultados.length; i++) {
if (resultados[i]) {
System.out.println(numeros[i] + " é primo");
} else {
System.out.println(numeros[i] + " não é primo");
}
}

sc.close();
}
}