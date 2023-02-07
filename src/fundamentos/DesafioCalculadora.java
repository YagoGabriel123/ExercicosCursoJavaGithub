package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// ler num1
		// ler num 2
		// ler a operação + - / * %
		// ENTRADAS
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite um número:");
		double s1 = entrada.nextDouble();
		System.out.println("digite a operação entre( +,-,*,/ e % )");
		String operacao = entrada.next(); 
		System.out.println("digite um número:");
		double s2 = entrada.nextDouble();
		 
		//LÓGICA
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
