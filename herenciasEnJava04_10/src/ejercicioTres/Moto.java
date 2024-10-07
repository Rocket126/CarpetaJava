package ejercicioTres;

public class Moto extends Vehiculo{
	
	
	public Moto(String marca, String modelo) {
		super(marca,modelo);
	}
	
	
	@Override //metodo extraido de la clase padre vehiculo
	public void mostrarDetalles()
	{
		System.out.println("Estos son los detalles de la Moto");
		super.mostrarDetalles();
		
	}
}
