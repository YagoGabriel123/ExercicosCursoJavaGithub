package fundamentos.Operadores;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 3.0;
		String resultadoParcial = media >= 5.0 ? " em recuperação " : "reprovado";
		String resultadoFinal = media >= 7.0 ? "Aprovado" : "Recuperação";
		
		System.out.println("O aluno está " + resultadoFinal);
	}

}
