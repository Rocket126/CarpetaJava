package octubre0110;

public class Libro {
	
	String titulo;
	Autor autor;
	
	Libro(String titulo, Autor autor)
	{
		this.titulo = titulo;
		this.autor = autor;
	}
	
	@Override
	public String toString()
	{
		return "titulo : "+titulo+ " y el Autor es: "+autor.toString();
	}
	
	
	
 
}
