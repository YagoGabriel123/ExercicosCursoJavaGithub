package Controle;

import java.util.Scanner;

public class IF {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a M�dia: ");
		double media = entrada.nextDouble();

		if (media <= 10 && media >= 7) {
			System.out.println("Aprovado");
			System.out.println("Parab�ns");
		}
		if (media < 7 && media >= 4.5) {
			System.out.println("Recupera��o");
			System.out.println("Estude!!!");
		}
		if (media < 4.5 ) {
			System.out.println("Reprovado");
			System.out.println("RLX, essa m�teria tem todo semestre");
		}
		
		entrada.close();
	}

}
