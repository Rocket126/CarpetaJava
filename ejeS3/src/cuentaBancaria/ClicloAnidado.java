package cuentaBancaria;

public class ClicloAnidado {

	public static void main(String[] args) {
		//Escribe un programa que imprima una tabla de multiplicar del 1 al 10. La tabla
		//debe tener el siguiente formato:
		
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println("tabla del:"+ i +" X "+ j + " =  "+ i*j);
			}
			System.out.println("\n");
		}
		
		
	}

}
