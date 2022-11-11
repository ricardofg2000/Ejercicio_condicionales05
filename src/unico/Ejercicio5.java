package unico;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/* Realiza un programa que resuelva una 
		   ecuación de primer grado (del tipo: ax+b = 0).
		   Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0

		 	Ejemplo 1:
			Por favor, introduzca el valor de a: 2
			Ahora introduzca el valor de b: 1
			x = -0.5 *
			
			Ejemplo 2:
			Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
			Por favor, introduzca el valor de a: 0
			Ahora introduzca el valor de b: 7
			Esa ecuación no tiene solución real.
			*/

		Scanner leer = new Scanner (System.in);
		
		double a;
		double b;
		double x;
		
		System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
		System.out.println("Por favor, introduzca el valor de a:");
		a = leer.nextDouble();
		System.out.println("Ahora introduzca el valor de b:");
		b = leer.nextDouble();
		
		if (a != 0) {
			x = -b/a;
			System.out.println("x = " + x);
		}
		else {
			System.out.println("Esa ecuación no tiene solución real");
		}
	

		
		
		
	}

}
