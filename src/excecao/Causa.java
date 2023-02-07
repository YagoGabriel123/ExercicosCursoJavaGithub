package excecao;

public class Causa {

	public static void main(String[] args) {
		
		metodoA(null);
	}
	
	static void metodoA(Aluno aluno) {
		
		
	}
	static void metodoB(Aluno aluno) {
	if(aluno == null) {
		
		throw new NullPointerException("Aluno está NULOOOO");
	}
	
	System.out.println(aluno.nome);
	
		
	}
}
//incompleto!!!!!!!!!!!!!!