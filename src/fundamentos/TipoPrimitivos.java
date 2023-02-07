package fundamentos;

public class TipoPrimitivos {

	public static void main(String[] args) {
		//Informações do funcionario
		
		//Tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L; // final com "L" para converte automatico de int para long
		
		// Tipoa numericoa reais
		float salario = 11_445.44F;//"F" para declarar a variavel em float não em double
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipos booleano
		boolean estaDeFerias = false; // ou true
		
		// Tipo caractere
		char status = 'a'; // apenas uma letra
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Números de viagens
		System.out.println(numeroDeVoos/2);
		
		//Pontos por real
		
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}
}
