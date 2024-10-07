package cuentaBancaria;

import java.util.Scanner;

public class CuentaBancaria {

	public static void main(String[] args) {
		
	int opcion;
	Scanner sc= new Scanner(System.in);
	float saldoInteres,saldoInicial, interes;
	
	
	System.out.println("Ingrese un saldo Inicial");
	saldoInicial=sc.nextInt();
	
	//Se sumarán 100 unidades como depósito.
	
	saldoInicial += 100; 
	System.out.println("Saldo inicial actual con deposito de 100 es de:  " + saldoInicial);
	
	saldoInicial -= 50;
	System.out.println("Saldo inicial con retiro de 50 es de:  " + saldoInicial);
	
	interes = saldoInicial*0.05f;
	saldoInicial+=interes; 
	System.out.println("Saldo mas interes del 5%: "+saldoInicial );
	
	
	
	
	}

}
