package modulo4Sesion3;

import java.util.Scanner;

public class EjercicioDos {

	public static void main(String[] args) {
		
		int numero, positivo=0, negativo=0, cero=0;
		
		Scanner sc = new Scanner(System.in); 
		
		
		for(int i=0;i<10;i++)
		{
			System.out.print("Ingresa numero: ");
			numero=sc.nextInt();
			
			if(numero>0)
			{
				positivo++;
			}
			else if(numero==0){
				cero++;
			}
			else {
				negativo++;
			}
		}//fin for
		
		System.out.println("El numero de ceros introducidos es de: "+cero);
		System.out.println("El numero de positivos introducidos es de: "+ positivo);
		System.out.println("El numero de negativos introducidos es de: "+ negativo);

	}

}
