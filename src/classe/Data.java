package classe;

public class Data {

	int mes;
	int dia;
	int ano;
	
	Data(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
	this(1,1,1970);
	
	}
	
	
	Data(final int dia, int mes, int ano){
		
		this.dia = dia;
		this.mes = mes; 
		this.ano = ano;
		
	}
	 String obterDataFormatada(){
		 
		final String formato = "%d/%d/%d";
		 
		 return String.format(formato, this.dia, this.mes, this.ano);
		
	}
	 void imprimirDataformatada() {
		 
		 System.out.printf("%d/%d/%d", dia, mes, ano);
		 
		 
	 } 
}
