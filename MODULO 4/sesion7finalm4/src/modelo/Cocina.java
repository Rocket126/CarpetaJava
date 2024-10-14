package modelo;

import java.util.Scanner;

import interfaces.CocinaInterface;

public class Cocina extends Producto implements CocinaInterface{

	
	public int cantQuemadores;

	
	//inplementando metodos de la interfaz CocinaInterface
	@Override
	public void cambiarPrecio(int cambiar) {
		this.precio = cambiar;
		
	}

	@Override
	public int cantidadDisponible() {

		return cantidadDisponible;
		
	}

	@Override
	public void incluyeGas() {
		
			Scanner sc = new Scanner(System.in);
			String cadena;
			
			System.out.println("desea incluir un gas por 5000 Pesos? si o no");
			cadena = sc.nextLine();
			
			if(cadena.equals("si"))
			{
				this.cantidadDisponible--;
				System.out.println("Felicidades a comprado su cocina incluyendo gas");
			}
			else
			{
				this.cantidadDisponible--;
				System.out.println("Felicidades a comprado su cocina");
			}
	}
	
	public void setCantQuemadores(int n)
	{
		this.cantQuemadores = n;
	}
	
	@Override
	public String toString()
	{
		return "\nprecio: "+precio+"\ncantidad quemadores: "+cantQuemadores;
	}
	
}
