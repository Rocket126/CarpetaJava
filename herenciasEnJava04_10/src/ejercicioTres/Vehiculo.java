package ejercicioTres;

public class Vehiculo {//Clase Padre

	protected String marca;
	protected String modelo;
	
	public Vehiculo(String marca, String modelo)
	{
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public void mostrarDetalles()
	{
		System.out.println("marca: "+marca+" modelo: "+modelo);
	}
}
