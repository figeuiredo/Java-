package br.com.java;
import java.util.Scanner;
public class OperadoresAritiméticos {

	public static void main(String[] args) {
		float x,y;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Operadores Aritiméticos");
		System.out.println("Digite o valor de x:");
		x = teclado.nextFloat();
		System.out.println("Digite o valor de y:");
		y = teclado.nextFloat();
        // Soma 
		System.out.println("x + y =" + (x + y));
		// Subtração
		System.out.println("x - y =" + (x - y));
		 // Divisão 
		System.out.println("x / y =" + (x / y));
		// Multiplicação
		System.out.println("x * y =" + (x * y));
		// Módulo (usado para obter o resto da divisão)
		System.out.println("x % y =" + (x % y));
		// Incremento x++ (equivale a x = x + 1)
		x++;
		System.out.println("x++ " + x);
		// Decremento y-- ( equivale a y = y - 1)
		y--;
		System.out.println("y-- " + y);
	}

}
