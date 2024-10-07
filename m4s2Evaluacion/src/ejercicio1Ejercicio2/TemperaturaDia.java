package ejercicio1Ejercicio2;

import java.util.Scanner;

public class TemperaturaDia {

	public static void main(String[] args) {
		float t;
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Ingrese la temperatura");
		t = sc.nextFloat();
		
		if(t <= 10)
		{
			System.out.println("Hay "+ t +" Grados. El tipo de clima hoy es frio");
		}
		else if(t > 10 && t<20)
		{
			System.out.println("Hay "+ t +" Grados. El tipo de clima hoy es nublado");
		}
		else if(t >20 && t<30)
		{
			System.out.println("Hay "+ t +" Grados. El tipo de clima hoy es Caluroso");
		}
		else if (t >= 30 ){
			System.out.println("Hay "+ t +" Grados. El tipo de clima hoy es tropical");
		}
	}

}
