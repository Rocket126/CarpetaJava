package octubre0110;

public class Empleado {

	String nombre;
	int salario;
	
	Empleado(String nombre, int salario)
	{
		this.nombre = nombre;
		this.salario = salario;
	}
	
	@Override
	public String toString()
	{
		return nombre+ " Salario: "+salario;
	}
}
