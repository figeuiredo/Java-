package br.com.java;

import java.util.Scanner;

public class VerificarObrigatoriedadeVoto {

	public static void main(String[] args) {
		int idade;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Verificar obrigatoriedade de votar");
		System.out.println("Digite a sua idade: ");
		idade = teclado.nextInt();
		/* critérios 
		 * Menor que 16 anos - proibido votar
		 * Entre 18 e 70 - obrigatório votar
		 */
		if (idade < 16) {
			System.out.println("Proibido votar");
			
		} else if (idade == 16 || idade == 17 || idade > 70) {
			System.out.println("Voto facultativo");
		} else	{
			System.out.println("Voto obrigatório");
		}

	}

}
