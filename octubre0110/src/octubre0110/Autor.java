package octubre0110;

public class Autor {
	
	String nombre;
	String nacionalidad;
	
	Autor(String nombre, String nacionalidad)
	{
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
	}
	
	@Override
	public String toString()
	{
		return  nombre+" y La nacionalidad es: "+nacionalidad;
	}
	
}
