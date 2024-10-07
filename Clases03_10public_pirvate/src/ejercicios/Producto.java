package ejercicios;



public class Producto {
	
     private String nombre;
     public int precio;
     private int cantidad;

    // Constructor
     /*public Producto(String nombre, int precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }*/
     
     public Producto() {
     }
 
  
     ///setter y getter
     // setter no retorna nada(void) y publico
     // parametro: el nombre
 
     public void setNombre(String nombre) {
    	 this.nombre=nombre;
     }
     
     //getter  publico si retorna(atributo)
     public String getNombre() {
    	 return this.nombre;
     }
     
     
     public void setCantidad(int cantidad) {
    	
    	 if(cantidad<0) {
    		 this.cantidad=0;
    	 }else {
    		 this.cantidad=cantidad;
    	 }
     }
     
     //getter  publico si retorna(atributo)
     public int getCantidad() {
    	 return this.cantidad;
     }
}
