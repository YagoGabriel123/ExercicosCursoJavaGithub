package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1;// conversa� implicita
		System.out.println(a);
		
		float b = (float)1.123456788888; // convers�o explicta vulgo CAST
		System.out.println(b);
		
		int c = 340;
		byte d = (byte)c;// convers�o explicta vulgo CAST
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e; // convers�o explicta vulgo CAST
		System.out.println(f);
	}

}
