package modelo;

import interfaces.ProductoInterface;

public class Refrigerador extends Producto implements ProductoInterface{

	public String gastoElectrico;// (A, B, C, D, E)
	
	public int nPuertas;
	
	
	
	
	
	
	public void setGastoEletrico(String gasto)
	{
		this.gastoElectrico = gasto;
	}
	
	public void setNPuertas(int puertas)
	{
		this.nPuertas = puertas;
	}
	
	
	
	@Override
	public void cambiarPrecio(int cambiar) {//metodo heredado de la interface productoInterface
		this.precio = cambiar;
	}
	
	@Override
	public int cantidadDisponible() {//metodo heredado de la interface productoInterface
		return cantidadDisponible;
	}
	
	public void compraRefrigerador()
	{
		this.cantidadDisponible--;
	}
	
	@Override
	public String toString()
	{
		return "Valor: "+precio+"\nGasto Electrico: "+gastoElectrico+"\n puertas: "+nPuertas;
	}
}
