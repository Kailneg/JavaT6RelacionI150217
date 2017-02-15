package ejercicio01;

public class TestRectangulo {

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo(2, 4);
		Rectangulo r2 = new Rectangulo(5, 10);
		
		System.out.println("R1 area: " + r1.CalcularArea() + 
				" R1 perímetro: " + r1.CalcularPerimetro());
		System.out.println("R2 area: " + r2.CalcularArea() + 
				" R2 perímetro: " + r2.CalcularPerimetro());
	}
}
