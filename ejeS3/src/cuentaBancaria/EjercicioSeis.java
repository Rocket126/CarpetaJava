package cuentaBancaria;

import java.util.Scanner;

public class EjercicioSeis {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int producto;
		float descuento,total=0;
		
		
		for(int i=1; i<=5;i++)
		{
			System.out.println("Ingrese producto: "+i);
			
			producto = sc.nextInt();
			total+=producto;
			
		}
		
		if(total>100)
		{
			descuento=total*0.1f;
			 
			total-=descuento;
			System.out.println("Descuento: "+descuento);
			System.out.println("Total productos a pagar: "+total);
		}
		else
		{
			System.out.println("Total productos a pagar: "+total);
		}
		
		

	}

}
