package ejercicioTres;

public class EjercicioTres {

	public static void main(String[] args)
	{
		Coche coche = new Coche("Toyota", "Corolla");
		
		Moto moto = new Moto("Suzuki", "RX1000");
		
		
		coche.mostrarDetalles();//Detalles del coche marca:"Toyota"  modelo:"Corolla"
		
		moto.mostrarDetalles();
		
	}
}
