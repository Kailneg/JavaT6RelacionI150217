package ejercicio03;

public class Tiempo {

	private int hora, minuto, segundo;
	//false 24h true 12/12
	private boolean AMPM = false;
	
	public Tiempo(int hora, int minuto, int segundo, boolean aMPM) {
		if (aMPM && hora <= 12){
			setHora(hora);
			setMinuto(minuto);
			setSegundo(segundo);
		} else if (!aMPM && hora <= 24) {
			setHora(hora);
			setMinuto(minuto);
			setSegundo(segundo);
		}
	}

	public Tiempo(int hora, int minuto, int segundo) {
		this(hora, minuto, segundo, false);
	}
	
	public Tiempo (int horas, int minutos){
		this(horas, minutos, 0);
	}
	
	public Tiempo (int horas){
		this(horas, 0, 0);
	}

	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public void setMinuto(int minuto) {
		if (minuto <= 60) 
			this.minuto = Math.abs(minuto);
	}

	public void setSegundo(int segundo) {
		if (segundo <= 60) 
			this.segundo = Math.abs(segundo);
	}
	
	public String toString(){
		return hora + ":" + minuto + ":" + segundo;
	}
}
