package ejercicioMatrices;

import java.util.Scanner;

public class EjercicioSeis {

	public static void main(String[] args) {
		int[][] matriz = new int[2][2];
		
		int numero, resultado=0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<matriz.length;i++)
		{
			for(int j=0; j<matriz.length;j++)
			{
				System.out.println("Ingresa el numero para la posicion ["+i+"]["+j+"]: " );
				matriz[i][j]=sc.nextInt();
			}
		}
		
		//Pedimos el valor para multiplicar en la matriz
		System.out.println();
		System.out.println("Ingresa el numero para la multiplicacion: ");
		numero=sc.nextInt();
		
		
		//multiplicar elementos de la matriz
		for(int i=0; i<matriz.length;i++)
		{
			for(int j=0; j<matriz.length;j++)
			{
				resultado = matriz[i][j]*numero;
				System.out.println("la multiplicacion de ["+i+"]["+j+"]: "+matriz[i][j]+" por "+numero+" = "+resultado);
			}
		}
		
		
		//muestro la matriz
		System.out.println();
		System.out.println("Impriendo valores ingresados en la matriz" );
		for(int i=0; i<matriz.length;i++)
		{
			for(int j=0; j<matriz.length;j++)
			{
				System.out.print(matriz[i][j]+" " );
				
			}
			System.out.println();
		}
		

	}

}
