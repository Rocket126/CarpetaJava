package octubre0110;

public class Empresa {

	String nombreEmpresa;
	Empleado empleado;
	
	Empresa(String nombreEmpresa, Empleado empleado)
	{
		this.nombreEmpresa = nombreEmpresa;
		this.empleado = empleado;
	}
	
	public String toString() {
		return "Nombre empresa: "+nombreEmpresa+" Nombre empleado: "+empleado.toString();
	}
}
