package ejercicio05;

public class TestLibros {

	public static void main(String[] args) {

		Libro l1 = new Libro("Pan", "Peter", 30, 4);
		Libro l2 = new Libro("Asado", "Pepe", 400, 9);
		Libro l3 = new Libro("New", "Hope", 500, 5);
		
		ConjuntoLibros cl = new ConjuntoLibros();
		
		cl.a�adirLibro(l1);
		cl.a�adirLibro(l2);
		
		cl.eliminarLibroAutor("Peter");
		cl.eliminarLibroTitulo("Asado");
		
		cl.a�adirLibro(l3);
		
		System.out.println(cl.toString());
	}

}
