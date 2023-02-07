package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s =  "Bom dia X"; // conjunto de char
		s = s.replace( "X", "Senhora"); // Substitui "x" por "senhora"
		s = s.toUpperCase(); // Converte para letras maisculas
		s = s.concat("!!!"); // Soma a palavra dentro do parantese a variavel
		
		System.out.println(s);
		
		String x = "Leo".toUpperCase(); // Converte em maiuscula direto
		System.out.println(x);
		
		String y = "Bom dia X".replace("X", "Gui").toUpperCase(); // Troca "x" por "Gui", depois transforma em maiscula
		System.out.println(y);
	}

}
