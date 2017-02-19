package ejercicio05;

public class Libro {

	private String titulo;
	private String autor;
	private int nPaginas;
	private int calificacion;
	
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
		this.calificacion = calificacion;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", nPaginas=" + nPaginas + ", calificacion="
				+ calificacion + "]";
	}
	
}
