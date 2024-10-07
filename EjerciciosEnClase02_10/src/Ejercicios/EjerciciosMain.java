package Ejercicios;

public class EjerciciosMain {

	public static void main(String[] args) {
		
		//Ejercicio 1 Cuadrado
		Cuadrado cuadrado = new Cuadrado(6, "Azul", "Acero", "Centimetros", "Cuadrado");
		
		System.out.println("los valores de mi cuadrado son: \n"+cuadrado);

		//llamando metodos por separado
		System.out.println("valor Area: "+cuadrado.area());
		System.out.println("valor Perimetro: "+cuadrado.perimetro());
		
		System.out.println();
		
		
		
		//Ejer. 2 Obteniendo el objeto TRIANGULO
		ClaseTrinagulo claseTrinagulo = new ClaseTrinagulo(11, 7, 11, 7.5, "Triangulo");
		//imprimiendo
		System.out.println("los valores de mi triangulo son: \n"+claseTrinagulo);
		
		//Obteniendo el perimetro
		System.out.println("valor Perimetro: "+claseTrinagulo.perimetro() );
		
		//Obteniendo el perimetro
		System.out.println("valor area: "+claseTrinagulo.area() );
		
		
		System.out.println();
		
		
		
		//Ejercicio 3 EMPLEADO DEPARTAMENTO
		Departamento departamento = new Departamento("Ventas", "Ulises");
		
		Empleado empleado = new Empleado("Javier Cisterna", 30, 500.00, "Atencion al publico", departamento);
		//imprimiendo datos de empleado
		System.out.println("Datos de empleado: \n"+empleado);
		
		
		System.out.println();
		
		
		//Ejercicio 4: Clase Rectángulo 
		Rectangulo rectangulo = new Rectangulo(2, 6, "Azul", "madera"," Rectangulo");
		System.out.println("Datos del rectangulo: \n"+rectangulo);
		
		System.out.println("Rectangulo Area: \n"+rectangulo.area());
		System.out.println("Rectangulo Perimetro: \n"+rectangulo.perimetro());
		
		
		System.out.println();
		
		
		//Ejercicio 5: Interacción de Clases Profesor y Curso 3pts
		Curso curso = new Curso("Informatica", 430);
		
		Profesor profesor = new Profesor("Ulises", 45, "Programacion en Java", 1500000, curso);
		System.out.println("Datos del profesor: \n"+profesor);
		
		
		
		
	}

}
