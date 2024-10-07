package ejercicioMatrizProfe;


public class Arreglos {

	public static void main(String[] args) {
		
		int[] arreglo= new int[3];
		
		arreglo[0] = 3;
		arreglo[1] = 2;
		arreglo[2] = 1; 
		
		for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Elemento en el índice " + i + ": " + arreglo[i] + "-");
        }
		
		System.out.println("Elemento : " + arreglo[0]);
		
		
		for (int elemento : arreglo) {
            System.out.println("Elemento: " + elemento);
        }  
			
	}

}