package ejercicio01;

public class Rectangulo {

	private int base;
	private int altura;
	
	public Rectangulo(int base, int altura) {
		
		this.base = base;
		this.altura = altura;
	}
	
	public int CalcularArea(){
		return base*altura;
	}
	
	public int CalcularPerimetro(){
		return base+base+altura+altura;
	}
}
