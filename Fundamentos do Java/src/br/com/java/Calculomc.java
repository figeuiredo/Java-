package br.com.java;

import java.util.Scanner;

public class Calculomc {

	public static void main(String[] args) {
		// A linha abaixo cria vari�veis num�rica de precis�o
		// float e double s�o tipos primitivos numericos 
		double peso, altura, imc;
		System.out.println("Digite o seu peso em kg: ");
		//entrada 
		Scanner teclado = new Scanner(System.in);
		// a linha abaixo passa o valor digitado para a vari�vel peso
		peso = teclado.nextDouble();
		System.out.println("Digite sua altura em metros: ");
		altura = teclado.nextDouble();
		// a linha abaixo faz o calculo de imc 
		imc = peso / (altura * altura);
		//sa�da
        System.out.println(" o valor da sua massa corporal �: " + imc);
	}

}
