package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// ler num1
		// ler num 2
		// ler a opera��o + - / * %
		// ENTRADAS
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite um n�mero:");
		double s1 = entrada.nextDouble();
		System.out.println("digite a opera��o entre( +,-,*,/ e % )");
		String operacao = entrada.next(); 
		System.out.println("digite um n�mero:");
		double s2 = entrada.nextDouble();
		 
		//L�GICA
		double resultado = "+".equals(operacao) ? s1+s2 : 0;
		resultado = "-".equals(operacao) ? s1-s2 : resultado;
		resultado = "*".equals(operacao) ? s1*s2 : resultado;
		resultado = "/".equals(operacao) ? s1/s2 : resultado;
		resultado = "%".equals(operacao) ? s1%s2 : resultado;
		
		//SAIDA
		System.out.printf("%.2f %s %.2f = %.2f", s1,operacao,s2,
				resultado);
		
		
		entrada.close();

	}

}
