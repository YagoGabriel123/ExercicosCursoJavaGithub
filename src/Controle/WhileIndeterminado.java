package Controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" digite algo:");
		
		String enter = "";
		enter = entrada.nextLine();
		
		while(!enter.equalsIgnoreCase("sair")) {
		
			System.out.println(" digite algo:");
			
		  enter = entrada.nextLine();
		
		
		}
/*/*		while(enter.equalsIgnoreCase("sair")) {
			
			System.out.println("fim!!!");
			
			break;
/*/		
		entrada.close();
		
	}

}
