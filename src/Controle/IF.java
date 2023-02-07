package Controle;

import java.util.Scanner;

public class IF {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a Média: ");
		double media = entrada.nextDouble();

		if (media <= 10 && media >= 7) {
			System.out.println("Aprovado");
			System.out.println("Parabéns");
		}
		if (media < 7 && media >= 4.5) {
			System.out.println("Recuperação");
			System.out.println("Estude!!!");
		}
		if (media < 4.5 ) {
			System.out.println("Reprovado");
			System.out.println("RLX, essa máteria tem todo semestre");
		}
		
		entrada.close();
	}

}
