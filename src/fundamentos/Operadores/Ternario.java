package fundamentos.Operadores;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 3.0;
		String resultadoParcial = media >= 5.0 ? " em recupera��o " : "reprovado";
		String resultadoFinal = media >= 7.0 ? "Aprovado" : "Recupera��o";
		
		System.out.println("O aluno est� " + resultadoFinal);
	}

}
