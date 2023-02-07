package fundamentos.Operadores;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		//operador unario
		boolean maisSaudavel = !comprouSorvete; 
		
		System.out.println("cOMPROU tv 50\"?" + comprouTV50);
		System.out.println("cOMPROU tv 32\"?" + comprouTV32);
		System.out.println("cOMPROU tv 32\" Sorvete? " + comprouSorvete);
		System.out.println("mais saudavel? " + maisSaudavel);
		
	}
	

}
 