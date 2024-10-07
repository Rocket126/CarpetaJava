package octubre0110;

public class Concesionario {

	String nombre;
	Coche coche;
	
	
	Concesionario(String nombre, Coche coche)
	{
		
		
			this.nombre = nombre;
			this.coche = coche;
		
	}
	
	@Override
	public String toString()
	{
		return "nombre : "+nombre+ " modelo: "+coche.toString();
	}
	
	
	
}
