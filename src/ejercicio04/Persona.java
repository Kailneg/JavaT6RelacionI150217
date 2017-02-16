package ejercicio04;

import java.util.Iterator;

public class Persona {
	
	private String DNI;
	private Cuenta[] cuentas = new Cuenta[3];
	
	public Persona(String dNI, Cuenta[] cuentas) {
		DNI = dNI;
		this.cuentas = cuentas;
	}
	
	public Persona(String dNI) {
		DNI = dNI;
	}
	
	public void nuevaCuenta(float ingresoInicial){
		String s = Cuenta.siguienteNumeroCuenta();
		int numeroCuentas = this.numeroCuentas();
		
		if (this.numeroCuentas() < 3)
			cuentas[numeroCuentas] = new Cuenta(s, ingresoInicial);
		else
			System.out.println("La persona ya tiene el máximo de cuentas");
		
	}

	private int numeroCuentas(){
		int cuentasCreadas = 0;
		
		for (Cuenta cuenta : cuentas) 
			if(cuenta != null)
				cuentasCreadas++;
		
		return cuentasCreadas;
	}

}
