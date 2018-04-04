/*
 * Programa que solicite  un número entero entre 0 y 10 y 
 * visualiza su tabla de multiplicar. Si el número no está en el rango [0-10] vuelve a solicitarlo.
 */
import java.util.Scanner;
//Este comentario es de prueba

public class Ejercicio3 {

	// Constantes
	private static final int MINIMO_NUMERO_TABLA = 1;
	private static final int MAXIMO_NUMERO_TABLA = 10;
	private static final int MINIMO_FACTOR = 0;
	private static final int MAXIMO_FACTOR = 10;
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		// Variables
		int numero;
		int contador;
		int resultado;

		// Inicio
		do {
			System.out.println("Introduce un número positivo (" + MINIMO_NUMERO_TABLA + " a " + MAXIMO_NUMERO_TABLA + "): ");
			numero = Integer.parseInt(teclado.nextLine());
		} while (numero < MINIMO_NUMERO_TABLA || numero > MAXIMO_NUMERO_TABLA);

		System.out.println("Tabla del "+ numero);
		
		// Opción con WHILE
		
		contador = MINIMO_FACTOR;
		while (contador <= MAXIMO_FACTOR){
			resultado = numero * contador;
			System.out.println(numero + "x" + contador + "=" + resultado);
			contador++;
		}
		

	}
}
