package PracticasGit;

import java.util.Scanner;

public class Ejercicio1Git {

	public static void main(String[] args) {
		System.out.println("Hoy es dia 20/11/2019 \t Alonso \t 9:26am");
		Scanner entrada = new Scanner(System.in);
		//introducimos por teclado ambos n�meros
		System.out.println("Introduzca el primer n�mero: ");
		int num1 = entrada.nextInt();
			System.out.println("Introduzca el segundo n�mero: ");
		int num2 = entrada.nextInt();
		//comparamos los n�meros
		while (num1 != num2){
			if (num1 > num2)
				num1 = num1 - num2;
			else
				num2 = num2 - num1;
		}
		System.out.println("El minimo comun multiplo es: " + num1);


	}

}
