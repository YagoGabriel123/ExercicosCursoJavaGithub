package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Ola pessoal".charAt(2)); // .chartAt(x) -> retorna a letra na posição x
		
		String s = "Boa tarde";
			System.out.println(s.concat("!!!"));//.concat("x") -> concatena "s" com "x"
			System.out.println(s + "!!!");
			System.out.println(s.startsWith("Boa"));//.startWith("x") -> retorna true se "s" inicar com "x"
			System.out.println(s.toLowerCase().startsWith("boa")); //toLowerCase() -> transforma "s" em minuscula
			System.out.println(s.toUpperCase().endsWith("tarde!"));//.toUpperCase() -> transforma "s" em maiuscula || .endsWith("x") -> retorna true se "s" terminar com "x"
			System.out.println(s.length());// retorna a quantodade de caracteres
			System.out.println(s.equals("boa tarde"));// compara "s" a "boa tarde"
			System.out.println(s.equalsIgnoreCase("boa tarde"));// compara e ignora maisculas e minusculas
			
			
			var nome = "Pedro";
			var sobrenome = " Santos";
			var idade = 33;
			var salario = 12345.789F;
			
			System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f.",// %s = string | %d = inteiros | %f = flutuantes | .2 = limita casas decimais
					nome, sobrenome,idade, salario);
			
			String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f.",// %s = string | %d = inteiros | %f = flutuantes | .2 = limita casas decimais
					nome, sobrenome,idade, salario);
			System.out.println(frase);
			
			System.out.println("frase qualquer".substring(6,9));//separa do elemento 6 ate o 8 da string
			
	}

}
