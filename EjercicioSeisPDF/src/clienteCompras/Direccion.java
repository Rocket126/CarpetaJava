package clienteCompras;

public class Direccion {
	String calle;
	String ciudad;
	String pais;
	
	Direccion(String calle,	String ciudad, String pais) {
		this.calle = calle;
		this.ciudad = ciudad;
		this.pais = pais;
		
	}
	@Override
	public String toString()
	{
		return "calle: "+calle+", ciudad: "+ciudad+", País: "+pais;
	}
}
