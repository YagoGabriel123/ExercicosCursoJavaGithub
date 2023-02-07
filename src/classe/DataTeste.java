package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		
		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(dataFormatada1);
		
		var d2 = new Data(31,12,2020);
		
		
		System.out.printf(d2.obterDataFormatada());
		
		
	}
}
