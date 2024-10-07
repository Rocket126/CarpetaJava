package resolverGuia;


import java.util.Arrays;

public class EjercicioCuatro {

	public static void main(String[] args) {
		//: Contador de Vocales en un Arreglo de Cadenas

		String[] cadenas = {"Hola","Mundo"};
		System.out.println(Arrays.toString(cadenas));
		
		System.out.println();//Salto de linea
		
		int a, e, i, o, u;
		
		
		//Recorriendo el vector por cada palabra y por cada letra
		for(int k=0; k<cadenas.length;k++)
		{
			a=0; e=0; i=0; o=0; u=0;
			
			for(int j=0; j<cadenas[k].length();j++)
			{
				if(cadenas[k].charAt(j) == 'a')
				{
					a++;
				}
				if(cadenas[k].charAt(j) == 'e')
				{
					e++;
				}
				if(cadenas[k].charAt(j) == 'i')
				{
					i++;
				}
				if(cadenas[k].charAt(j) == 'o')
				{
					o++;
				}
				if(cadenas[k].charAt(j) == 'u')
				{
					u++;
				}
				
			}//fin for interno
			
		System.out.println("La cadena "+cadenas[k]+" contiene esta cantidad de vocales");//salto de linea
		
		System.out.println("Total vocales a: "+a);
		System.out.println("Total vocales e: "+e);
		System.out.println("Total vocales i: "+i);
		System.out.println("Total vocales o: "+o);
		System.out.println("Total vocales u: "+u);	
			
			
		}//fin for
		
		
		
		
		
	}

}
