package Ejercicios;

public class Cuadrado {
	
	
	double lado;
	String color;
	String material;
	String unidadMedida;
	String nombre;
	
	
	Cuadrado(double lado, String color, String material, String unidadMedida, String nombre){
		this.lado = lado;
		this.color = color;
		this.material = material;
		this.unidadMedida = unidadMedida;
		this.nombre = nombre;
	}
	
	//creamos el metodo calcular area
	double area()
	{
		return  lado*lado;
	}
	
	double perimetro()
	{
		return  lado*4;
	}
	
	@Override
	public String toString()//van solo los datos de los atributos
	{
		return "valor lado: "+lado +", color: "+color+", Material: "+material+
				", unidadMedida: "+unidadMedida+", Nombre: "+nombre;
	}
	//"valor area: "+area()+" valor perimetro: "+perimetro()
	
	
	
	
}
