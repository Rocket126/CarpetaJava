package ejercicioUno;

public class EjercicioUno {

	public static void main(String[] args) {
		
		int[] vector = new int[6];
		
		vector[0] = 1;
		vector[1] = 3;
		vector[2] = 5;
		vector[3] = 8;
		vector[4] = 9;
		vector[5] = 15;
		
		
		for(int i = 0 ; i<vector.length;i++)
		{
			System.out.println("posicion "+i+" valor: "+vector[i]);
		}
		
		//valor en la posicion 2
		vector[1] = 30;
	
		System.out.println("el valor en la posicion 2 es: "+vector[1]);
		
		
		
	}

}
