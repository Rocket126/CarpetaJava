package ejercicioTres;

public class Coche extends Vehiculo{
	
	public Coche(String marca, String modelo) {
		super(marca,modelo);
	}
	
	
	@Override //metodo extraido de la clase padre vehiculo
	public void mostrarDetalles()
	{
		System.out.println("Estos son los detalles del coche");
		super.mostrarDetalles();
		
	}
}
