package herenciasEnJava04_10;

public class Perro extends Animal{
	
	String raza;
	String color;
	
	public Perro() {
		super();
	}
	
	
	@Override 
	public void hacerSonido()//metodo del padre para luego sobreescribir
	{
		super.hacerSonido();
		System.out.println("Guau Guau");
	}
}
