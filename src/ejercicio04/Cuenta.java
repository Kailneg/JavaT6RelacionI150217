package ejercicio04;

public class Cuenta {

	private String numeroCuenta;
	private double saldoDisponible;
	
	public Cuenta(String numeroCuenta, double saldoDisponible) {
		this.numeroCuenta = numeroCuenta;
		this.saldoDisponible = saldoDisponible;
	}

	public double consultarSaldo(){
		return saldoDisponible;
	}
	
	public static String siguienteNumeroCuenta(){
		return String.valueOf(Math.random());
	}
}
