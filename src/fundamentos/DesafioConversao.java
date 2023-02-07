package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);// define o teclado como entrada
		
		String s1 =  entrada.nextLine().replace(",", "."); // lê uma string do teclado e troca "," por "."
		String s2 =  entrada.nextLine().replace(",", "."); // lê uma string do teclado e troca "," por "."
		String s3 =  entrada.nextLine().replace(",", "."); // lê uma string do teclado e troca "," por "."
		double ss1 = Double.parseDouble(s1);
		double ss2 = Double.parseDouble(s2);
		double ss3 = Double.parseDouble(s3);
		
		double media = (ss1+ss2+ss3)/3;
		
		System.out.println(media);
		
		entrada.close();
	}

}
