package Ejercicios;

public class Rectangulo {
	
	double ancho; 
	double alto; 
	String color; 
	String material; 
	String nombre; 
	
	Rectangulo(double ancho,double alto, String color,	String material, String nombre) {
		
		this.ancho =ancho;
		this.alto = alto;
		this.color =color;
		this.material = material;
		this.nombre =nombre;
		
	}
	
	//Un método para calcular el perimetro del rectángulo.
	double perimetro()
	{
		return (ancho+alto)*2;
	}
	
	//metodo para calcular el area del rectangulo
	double area()
	{
		return ancho*alto;
	}
	@Override
	public String toString()
	{
		return "Ancho: "+ancho+", alto: "+alto+", color: "+color+", material: "+material+", nombre: "+nombre; 
	}

}
