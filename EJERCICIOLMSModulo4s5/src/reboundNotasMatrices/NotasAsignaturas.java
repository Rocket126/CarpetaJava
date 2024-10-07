package reboundNotasMatrices;

import java.util.Scanner;

public class NotasAsignaturas {

	public static void main(String[] args) {
		
			String [] asignaturas = new String[5];
			double [] notas = new double[5];
			double suma=0;
			
			Scanner sc = new Scanner(System.in);
			
			for(int i=0;i<asignaturas.length;i++)
			{
				System.out.println("Ingrese el nombre de la asignatura");
				asignaturas[i]=sc.next();
				
				System.out.println("Ingrese el promedio de la asignatura "+asignaturas[i]);
				notas[i]=sc.nextDouble();
			}
			
		
			sc.close();
			
			//imprimendo notas y asignaturas
			for(int i=0;i<notas.length;i++)
			{
				System.out.println(asignaturas[i]+" = "+notas[i]);
			}
			
			//obtener promedio
			for(double elemento : notas)
			{
				suma+=elemento;
			}
			
			System.out.println("Su promedio general es: "+ suma/notas.length);//obtengo el tamaño del vector notas y divido suma/con por el tamaño
	}

}
