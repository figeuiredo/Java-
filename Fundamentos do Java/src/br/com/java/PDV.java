package br.com.java;

import java.util.Scanner;

public class PDV {

	public static void main(String[] args) {
		double preço, desconto, total, valorpago, troco;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Preço: ");
        preço = teclado.nextDouble();
        //entrada
        System.out.println("% desconto");
        desconto = teclado.nextDouble();       
        total = preço - ((preço * desconto) /100);
        System.out.println("valor total: " + total);
        //processamento
        System.out.println("valor pago:");
        valorpago = teclado.nextDouble();
        //saída
         troco = (valorpago - total);
         System.out.println("troco: " + troco);
	}

}
