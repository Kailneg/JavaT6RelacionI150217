package ejercicio02;

public class Coche {

	private String marca;
	private String color;
	private String modelo;
	private int nCaballos;
	private byte nPuertas;
	private String matricula;
	private static int contador;
	private int posicion;
	
	public Coche(String marca, String color, String modelo, int nCaballos, byte nPuertas, String matricula) {
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.nCaballos = nCaballos;
		this.nPuertas = nPuertas;
		this.matricula = matricula;
		contador++;
		posicion = contador;
	}
	
	public void setColor (String color){
		System.out.println("Color del coche " + posicion + " cambiado a : " + color);
		this.color = color;
	}
	
	public String getColor(){
		return color;
	}
	
	public int getPosicion(){
		return posicion;
	}
}
