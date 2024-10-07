package resolverGuia;

import java.util.Scanner;

public class EjercicioDos {

	public static void main(String[] args) {
		
		int[] base = new int[3];
		int[] exponente = new int[3];
		
		
		Scanner sc =  new Scanner(System.in);
		
		//Llenamos el vector con numeros base
		for(int i=0;i<base.length;i++)
		{
			System.out.print("ingresa por consola la base "+i+": ");
			base[i] = sc.nextInt();//
		}
		
		//Llenamos el vector con numeros exponentes
		for(int i=0;i<exponente.length;i++)
		{
			System.out.print("ingresa por consola los exponentes "+i+": ");
			exponente[i] = sc.nextInt();//
		}
		
		//int 
		//calculamos base por exponente
		for(int i=0; i<base.length; i++)
		{
			System.out.println("La base "+base[i]+" por exponente "+exponente[i]+" es : "+Math.pow(base[i], exponente[i]));
		}
		
		
	}

}
