package Controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		
		String faixa = "preta";
				
		
		
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sai o Bassei-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
			break;
			default: 
				System.out.println("Não sei Nada");
		
		}
	}
}
