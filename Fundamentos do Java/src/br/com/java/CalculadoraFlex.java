package br.com.java;

import java.util.Scanner;

public class CalculadoraFlex {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double gasolina, alcool; 
		System.out.println("Calculadora FLEX");
		System.out.println("Digite o valor do álcool: ");
		alcool = teclado.nextDouble();
		System.out.println("Digite o valor da gasolina: ");
		gasolina = teclado.nextDouble();
		gasolina = (alcool / gasolina);
		if (gasolina < 0.7 ) {
			System.out.println("Melhor escolha o Álcool");
		} else {
            System.out.println("Melhor escolha gasolina");
		}
	}

}
