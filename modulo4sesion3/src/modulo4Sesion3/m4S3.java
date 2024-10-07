package modulo4Sesion3;

import java.util.Scanner;

public class m4S3 {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		int numero, par=0, impar=0;
		
		
		
		do
		{
			System.out.println("ingresa un numero del 1 al 100");
			numero=sc.nextInt();//pausa el do-while por la entrada por consola
			
			if(numero>=1 && numero<=100)//si el numero esta dentro del rango de 1 a 100
			{
				for(int i=1; i<=numero;i++)
				{
					if(i%2 == 0)//si es par
					{
						par++;
					}
					else {
						impar++;
					}
					
					
				}
			}
			else//si no esta dentro del rango
			{
				System.out.println("Error");
			}
			
		}while(numero<1 || numero>100);
		
		System.out.println("Saliendo del while");
		System.out.println("El total de numeros pares es: "+ par);
		System.out.println("El total de numeros impares es: "+ impar);
		
	}

}
