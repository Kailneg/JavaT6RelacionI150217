package ejercicio05;

public class Libro {

	private String titulo;
	private String autor;
	private int nPaginas;
	private int calificacion;
	public static final int CALIFICACION_MAX = 10;
	public static final int CALIFICACION_MIN = 0;
	
	public Libro(String titulo, String autor, int nPaginas, int calificacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.nPaginas = nPaginas;
		this.calificacion = calificacion;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setCalificacion(int calificacion) {
		if(calificacion >= 0 && calificacion <= 10)
			this.calificacion = calificacion;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", nPaginas=" + nPaginas + ", calificacion="
				+ calificacion + "]";
	}
	
}
