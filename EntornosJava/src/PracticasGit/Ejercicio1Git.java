package PracticasGit;

import java.util.Scanner;

public class Ejercicio1Git {

	public static void main(String[] args) {
		System.out.println("Hoy es dia 20/11/2019 \t Alonso \t 9:26am");
		Scanner entrada = new Scanner(System.in);
		//introducimos por teclado ambos números
		System.out.println("Introduzca el primer número: ");
		int num1 = entrada.nextInt();
			System.out.println("Introduzca el segundo número: ");
		int num2 = entrada.nextInt();
		//comparamos los números
		while (num1 != num2){
			if (num1 > num2)
				num1 = num1 - num2;
			else
				num2 = num2 - num1;
		}
		System.out.println("El minimo comun multiplo es: " + num1);


	}

}
