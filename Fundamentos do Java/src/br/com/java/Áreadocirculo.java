package br.com.java;

import java.util.Scanner;

public class Áreadocirculo {

	public static void main(String[] args) {
		double area, pi, raio;
		Scanner teclado = new Scanner (System.in);
		pi = 3.14;
		System.out.println("Digite o valor do raio: ");
		raio = teclado.nextDouble();
		raio = raio * raio;
		System.out.println("valor do raio: " + raio);
		System.out.println("Area do circulo: " +raio * pi );
		
				

	}

}
