package javaPoo;

public class EjercicioDos {

	public static void main(String[] args) {
		
		Libro libro  = new Libro("Harry potter","JK Rollings",5000);
		Libro libro2 = new Libro();//otro libro con distinto precio
		
		System.out.println(libro.titulo +" "+ libro.autor+" "+libro.precio);
		
		System.out.println(libro2.precio);
		
		
		
	}

}

class Libro{
	
	
	String titulo;
	String autor;
	double precio;
	
	
	Libro(String titulo, String autor,double precio)
	{
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}
	
	Libro()
	{
		this.precio = 500;
	}
	
	

}