package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		final double Fator = 5/9.0;
		final double Ajuste = 32;
		
		double tempf = 86;
		double tempc = (tempf - Ajuste) * Fator;
		
		System.out.println("A temperatura � " + tempc);
				
	
	}
}
