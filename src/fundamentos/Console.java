 package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1,2,3,4,5,6);
		System.out.printf("Salario : %.1f%n", 1234.45678);
		System.out.printf("Nome: %s%n", "João");
		
		int a =3;
		Scanner entrada = new Scanner(System.in);// define o teclado como entrada
		
		System.out.println("digite seu nome: ");
		String nome =  entrada.nextLine(); // lê uma string do teclado
		
		System.out.println("digite seu Sobrenome: ");
		String sobrenome =  entrada.nextLine();
		
		System.out.println("digite sua idade: ");
	   int idade =  entrada.nextInt();// lê um inteiro do teclado
		
		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
		
		entrada.close();
	}

}
