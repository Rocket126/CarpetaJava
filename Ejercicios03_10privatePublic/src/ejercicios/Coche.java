package ejercicios;

public class Coche {
	
	public String marca; 
	
	private String modelo;
	private int anio; 
	private double precio; 
	
	
	public Coche() {
		
	}
	
	public void setMarca(String marca)
	{
		this.marca = marca;
	}
	
	public String getMarca()
	{
		return this.marca;
	}
	
	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}
	
	public String getModelo()
	{
		return this.modelo;
	}
	
	public void setAnio(int anio)//validando entrada para año
	{
		if(anio>1886)
		{
			this.anio = anio;
		}
		else {
			this.anio = 1886;
		}
		
	}
	
	public int getAnio()
	{
		return this.anio;
	}
	
	//asignar valor a precio
	public void setPrecio(double precio)
	{
		if(precio>0)
		{
			this.precio = precio;
		}
		else{
			this.precio = 5000;
		}
		
	}
	
	//devolver el valor de precio con metodo get
	
	public double getPrecio()
	{
		return this.precio;
	}
	
	public String toString()
	{
		return "Marca: "+marca+", Modelo: "+modelo+", Año: "+anio+", Precio: "+precio;
	}
	
	
	
	
}
