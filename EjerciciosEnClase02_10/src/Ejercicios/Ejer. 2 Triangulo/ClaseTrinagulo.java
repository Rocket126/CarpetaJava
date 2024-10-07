package Ejercicios;

public class ClaseTrinagulo {
	
	double base;
	double altura;
	double lado1;
	double lado2; 
	String tipo;
	
	//constructor
	ClaseTrinagulo(double base,	double altura,	double lado1,	double lado2,	String tipo) {
		this.base = base;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2  = lado2;
		this.tipo  = tipo;
	}
	
	double area()
	{
		return (base*altura)/2;
	}
	
	double perimetro()
	{
		return lado1+lado2+base;
	}
	
	@Override
	public String toString()
	{
		return "Base: "+base+", altura: "+altura+", lado1: "+lado1+", lado2: "+lado2+", tipo: "+tipo;
	}
	
	
	
	
}
