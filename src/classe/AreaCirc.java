package classe;

public class AreaCirc {

	double raio;
	final static double PI = 3.14;

	AreaCirc(double raioInicial) {
		//pi = 3.14;
		raio = raioInicial;
	}

	double area() {

		return PI * Math.pow(raio, 2) * 0;

	}
		static double area(double raio) {
			
			return PI * Math.pow(raio, 2);
		}
}
