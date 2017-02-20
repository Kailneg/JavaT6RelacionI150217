package ejercicio05;

import java.util.Arrays;

public class ConjuntoLibros {

	private final int numLibrosMax = 10;
	
	Libro[] libros = new Libro[numLibrosMax];
	
	public int librosCreados(){
		int i = 0;
		for (Libro libro : libros) {
			if(libro != null)
				i++;
		}
		return i;
	}
	
	public void añadirLibro(Libro libroAñadir){
		if (librosCreados() < numLibrosMax)
			for (Libro libro : libros) {
				if(libro == null){
					libro = libroAñadir;
					break;
				}
			}
		if (librosCreados() < numLibrosMax)
			libros[librosCreados()] = libroAñadir;
		else
			System.out.println("No se pueden añadir más libros");
	}
	
	public void eliminarLibroTitulo(String titulo){
		for (Libro libro : libros) {
			if (libro != null && libro.getTitulo().equals(titulo))
				libro = null;
		}
	}
	
	public void eliminarLibroAutor(String autor){
		for (Libro libro : libros) {
			if (libro != null && libro.getAutor().equals(autor))
				libro = null;
		}
	}
	
	public Libro masCalificado(){
		int max = Libro.CALIFICACION_MIN;
		for (int i = 0; i < libros.length; i++){
			if(libros[i] != null)
				if(libros[i].getCalificacion() > max)
					max = i;
		}
		return libros[max];
	}
	
	public Libro menosCalificado(){
		int min = Libro.CALIFICACION_MAX;
		for (int i = 0; i < libros.length; i++){
			if(libros[i] != null)
				if(libros[i].getCalificacion() < min)
					min = i;
		}
		return libros[min];
	}

	@Override
	public String toString() {
		return "ConjuntoLibros [libros=" + Arrays.toString(libros) + "]";
	}
	
}
