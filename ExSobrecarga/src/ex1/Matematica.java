package ex1;

public class Matematica {

public static boolean isPrimo(int numero) {
if (numero <= 1) {
return false;
}
for (int i = 2; i <= Math.sqrt(numero); i++) {
if (numero % i == 0) {
return false;
}
}
return true;
}

public static boolean[] isPrimo(int[] numeros) {
boolean[] resultados = new boolean[numeros.length];
for (int i = 0; i < numeros.length; i++) {
resultados[i] = isPrimo(numeros[i]);
}
return resultados;
}
}
