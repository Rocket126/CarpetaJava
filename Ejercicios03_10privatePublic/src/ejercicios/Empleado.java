package ejercicios;

public class Empleado {
		public String nombre;
		private double salario;
		private int edad;
		
		public Empleado() {//constructor vacio
		}
		
		public void setNombre(String nombre)//Modifico el valor por medio del parametro con el metodo set
		{
			this.nombre = nombre;
		}
		
		public String getNombre()//Devuelvo el dato de tipo string
		{
			return this.nombre;
		}
		
		
		public void setSalario(double salario)
		{
			if(salario>0)
			{
				this.salario = salario;
			}
			else {
				this.salario = 100;
			}
			
		}
		
		public double getSalario()
		{
			return this.salario;
		}
		
		public void setEdad(int edad)
		{
			if(edad > 18 && edad <65)
			{
				this.edad = edad;
			}
			else
			{
				this.edad = 19;
			}
			
		}
		
		public int getEdad()
		{
			return this.edad;
		}
		
		
		public String toString()
		{
			return "Nombre: "+nombre+", Salario: "+salario+", Edad: " +edad;
		}
		
		
}
