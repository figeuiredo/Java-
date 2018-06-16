package br.com.java;

import java.util.Scanner;

public class CelsiusparaFahrenheit {

	public static void main(String[] args) {
		double celsius, fahrenheit, resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Conversao de Celsius para Fahrenheit");
		System.out.println("_____________________________________");
		//Entrada
		System.out.println("Digite o valor de Celsius: ");
		celsius = teclado.nextDouble();
		System.out.println("___________________________");
		//Processamento
		fahrenheit = (celsius * 1.8);
		resultado = (fahrenheit + 32);
		//saída
		System.out.println("Fahrenheit: " + resultado);
	}

}
