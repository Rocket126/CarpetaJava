package calcularImc;

import java.util.Scanner;

public class CalcularImc {

	public static void main(String[] args) {
		
		float altura, peso, imc;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese su peso");
		peso = sc.nextFloat();
		
		System.out.println("ingrese su altura");
		altura = sc.nextFloat();
		
		imc = peso/(altura*altura);
		
		System.out.printf("Su indice de masa muscular es: %.2f", imc);
	
		
		
		
	}

}
