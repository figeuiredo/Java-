package br.com.java;

import java.util.Scanner;

public class PDV {

	public static void main(String[] args) {
		double pre�o, desconto, total, valorpago, troco;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Pre�o: ");
        pre�o = teclado.nextDouble();
        //entrada
        System.out.println("% desconto");
        desconto = teclado.nextDouble();       
        total = pre�o - ((pre�o * desconto) /100);
        System.out.println("valor total: " + total);
        //processamento
        System.out.println("valor pago:");
        valorpago = teclado.nextDouble();
        //sa�da
         troco = (valorpago - total);
         System.out.println("troco: " + troco);
	}

}
