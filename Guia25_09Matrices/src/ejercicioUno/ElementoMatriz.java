package ejercicioUno;

import java.util.Scanner;

public class ElementoMatriz {

	public static void main(String[] args) {
		int[][] matriz = new int[2][3];
		Scanner sc = new Scanner(System.in);
		
		
		//matriz[0][0]= 1; matriz[0][1]=2; matriz[0][2] = 3;
		//matriz[1][0]= 4; matriz[1][1]=5; matriz[1][2] = 6;
		
		int fila, columna, contador=1;
		
		//llenamos la matriz
		for(int i=0; i<2 ; i++)
		{
			for(int j=0; j<3; j++)
			{
				matriz[i][j]=contador;
				contador++;
			}
		}
		
		//imprimir la matriz
		for(int i=0; i<2 ; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print( matriz[i][j]+" ");
			}
			System.out.println();
		}
		
		
				System.out.println("ingresa el numero de la fila entre 0 y 1: ");
				fila=sc.nextInt();
				
				System.out.println("ingresa la el numero de la columna entre 0 y 2: ");
				columna=sc.nextInt();
				
				System.out.println("ingresa tu nuevo valor para tu celda en la matriz ");
				matriz[fila][columna]= sc.nextInt();
				
				System.out.println();
				System.out.println("Nueva matriz");
				//imprimir cambio en la matriz
				for(int i=0;i<2;i++)
				{
					for(int j=0;j<3;j++)
					{
						System.out.print("["+ i +"]["+ j +"] = "+ matriz[i][j]+" ");
					}
					System.out.println();
				}
		
		
		
		
		
	}

}
