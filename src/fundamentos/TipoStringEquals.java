package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println( "2" == "2");
		
		String s1 = new String ("2");
		//System.out.println( "2" == s1);
		//System.out.println( "2".equals(s1); //.equals-> compara os conteudo
		
		Scanner entrada = new  Scanner(System.in);
		
		String s2 = entrada.next();
		//System.out.println( "2" == s2.trim()); // .trim() -> remove os espa�os da string
		System.out.println("2".equals(s2.trim())); // .equals(x) -> 
		 
		
	}
}
