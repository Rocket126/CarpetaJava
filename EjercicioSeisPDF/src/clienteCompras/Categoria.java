package clienteCompras;

public class Categoria {
	String nombreCategoria;
	double descuento;
	
	 Categoria(String nombreCategoria, double descuento) {
		this.nombreCategoria = nombreCategoria;
		this.descuento = descuento;
	}
	 
	 double getDescuento()//devuelve el porcentaje de descuento
	 {
		 return descuento/100;//0,15 descuento
	 }
	 @Override
	 public String toString()
	{
		return "Nombre Categoria: "+nombreCategoria+", Descuento: "+descuento+"%";
	}
	 
	 
}
