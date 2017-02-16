package ejercicio01;

public class Rectangulo {

	private float base;
	private float altura;
	
	public Rectangulo(int base, int altura) {
		
		this.base = base;
		this.altura = altura;
	}
	
	public float CalcularArea(){
		return base*altura;
	}
	
	public float CalcularPerimetro(){
		return base+base+altura+altura;
	}
}
