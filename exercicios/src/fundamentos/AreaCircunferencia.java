package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3;
		final double pi = 3.14;
		//uma vez que aplica o final o 3.14 imutavel
		double area = pi * raio * raio;
		System.out.println(area);
		
		
		raio = 10;
		area = pi * raio * raio;
		System.out.println("�rea = " + area);
	}
}
