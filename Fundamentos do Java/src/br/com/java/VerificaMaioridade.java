package br.com.java;

import java.util.Scanner;

public class VerificaMaioridade {

	public static void main(String[] args) {
		String nome; 
		int idade;
		Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Digite sua idade: ");
        idade = teclado.nextInt();
        System.out.println("");
        System.out.println("__________________________");
        System.out.println("Nome: " + nome);
        System.out.println("idade: " + idade);
        if (idade < 18) {
			System.out.println("Menor de idade");
		} else {
			System.out.println("Maior de idade");
		}

	}	
}