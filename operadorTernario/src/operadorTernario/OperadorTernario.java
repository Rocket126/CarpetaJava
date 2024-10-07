package operadorTernario;

import java.util.Scanner;

public class OperadorTernario {
	
		public static void main(String[] args)
		{
			Scanner sc  = new Scanner(System.in);
			int edad;
			
			System.out.println("Ingrese su edad");
			edad = sc.nextInt();
			
		 System.out.printf((edad>=18)? "es mayor de edad" : "es menor de edad");	
			//si le escribimos if(edad>=18), con el if no lo tomara, hay que hacerlo sin el "if"
		 //solo aplicar la condicion. Sumado a esto que no se puede agregar prints en las cadenas para imprimir.
		 //primero se crea el print y dentro el se crea el operador ternario para luego imprimir.
		 
			
		}
}
