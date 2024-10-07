package ejercicio1Ejercicio2;

import java.util.Scanner;

public class MenuSwitch {

	public static void main(String[] args) {
		
		int opn;
		float saldoInicial = 1000, saldo, deposito, retiro;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		do {	
			System.out.println("1.-Depositar \n2.-Retirar \n3.-Salir ");
			opn = sc.nextInt();
			
			switch(opn)
			{
				case 1:
				System.out.println("su saldo inicial es de: "+saldoInicial);
				
				System.out.println("Ingrese su monto a depositar");
				deposito = sc.nextFloat();
				saldoInicial= saldoInicial + deposito;
				
				System.out.println("Saldo actual es: "+saldoInicial);
				mensaje();
				
				break;
				
				case 2:
				System.out.println("Ingrese monto a retirar");
				retiro = sc.nextFloat();
				
				if(retiro>saldoInicial)
				{
					System.out.println("El monto a retirar es superior al saldo, saldo es insuficiente");
					System.out.println("Saldo es: "+ saldoInicial);
				}
				else if(saldoInicial < retiro)
				{
					System.out.println("Saldo insuficiente para retirar");
					System.out.println("El saldo es: "+saldoInicial );
				}
				else
				{
					saldoInicial = saldoInicial-retiro;
					
					System.out.println("El nuevo saldo es: "+saldoInicial );
				}
				
				break;
				
				case 3:
					mensaje();
					System.out.println("Saliendo del programa"); 
					
				break;
				
			}//fin switch
			
		}while(opn != 3);
		
		
	}//fin funcion main
	
	public static void mensaje()
	{	
		 
		System.out.println("Gracias por operar con nosotros");
	}

}
