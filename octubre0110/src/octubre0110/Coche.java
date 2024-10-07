package octubre0110;

public class Coche {

	String marca;
	String modelo;
	
	Coche(String marca, String modelo)
	{
		this.marca = marca;
		this.modelo = modelo;
	}
	
	@Override
	public String toString()
	{
		return marca+ " modelo: "+modelo;
	}
}
