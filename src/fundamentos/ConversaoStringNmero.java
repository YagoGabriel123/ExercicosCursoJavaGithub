package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNmero {
	public static void main(String[] args) {
		
			String valor1 = JOptionPane.showInputDialog("Digite o primeiro m�mero");
			
			String valor2 = JOptionPane.showInputDialog("Digite o segundo m�mero");
			
			System.out.println(valor1 + valor2);
			
			double numero1 = Double.parseDouble(valor1);// converte string para double
			
			double numero2 = Double.parseDouble(valor2);// converte string para double
			
			double soma = numero1 + numero2;
			System.out.println("Soma � " + soma);
			System.out.println("M�dia � " + soma/2);
	}

}
