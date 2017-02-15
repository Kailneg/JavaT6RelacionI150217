package ejercicio02;

public class TestCoche {

	public static void main(String[] args) {

		Coche c1 = new Coche("Zapato", "morado", "Titan", 33, (byte) 2, "ASD1");
		Coche c2 = new Coche("BMW", "rojo", "Cola", 190, (byte) 2, "ASD2");
		Coche c3 = new Coche("Alfa", "verde", "Calleja", 90, (byte) 5, "ASD3");
		
		System.out.println("Color del coche " + c1.getPosicion() +": " + " actual: " +
				c1.getColor());
		c1.setColor("blanco");
		System.out.println("Color del coche " + c2.getPosicion() +": " + " actual: " +
				c2.getColor());
		c2.setColor("blanco");
		System.out.println("Color del coche " + c3.getPosicion() +": " + " actual: " +
				c3.getColor());
		c3.setColor("blanco");
		
		System.out.println("Color del coche " + c1.getPosicion() +": " + " actual: " +
				c1.getColor());
		System.out.println("Color del coche " + c2.getPosicion() +": " + " actual: " +
				c2.getColor());
		System.out.println("Color del coche " + c3.getPosicion() +": " + " actual: " +
				c3.getColor());
	}

}
