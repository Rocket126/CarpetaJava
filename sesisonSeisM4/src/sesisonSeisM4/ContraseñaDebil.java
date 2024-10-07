package sesisonSeisM4;

import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContraseñaDebil {

	public static void main(String[] args) {
		
		String nombre, contraseña, nombreCompleto, fechaNacimiento, mensaje;
		int contadorM=0, contNumeros=0, contSimbolo=0 ,cantUsuarios=1, fechaEntera, anioActual=2024, edad=0;
		//boolean caractEspecial = false;
		
		//Usamos la clase Pattern
		//Para definir un patron conteniendo los caracteres que se desea buscar en la contraseña
		//Pattern especial = Pattern.compile("[?!¡@¿.,´#)]");
		
		Scanner sc = new Scanner(System.in); 
		
		//crear vector de tipo String para el metodo split
		String[] misFechas={};
		
		
		//Usuario se loguea
		
		
		do {
				System.out.print("Ingrese su nombre: ");
				nombre=sc.nextLine();
				
			do {
				System.out.print("Ingrese contraseña: ");
				contraseña=sc.nextLine();
				
				if(contraseña.length()<10)
				{
					System.out.println("Contraseña débil");
					System.out.println("------------------------");
				}else
				{
					contadorM=0;
					contNumeros=0;
					//validar que la contraseña contenga al menos 2 letras mayusculas
					for(int i=0; i<contraseña.length();i++)
					{
						//con la clase caracter accedor a mi metodo isUpperCase que evalua si el caracter es
						//mayuscula o no, si lo es devuelve "true", si no "falso"
						if(Character.isUpperCase(contraseña.charAt(i)))
						{								
							contadorM++;			
						}							
						if(Character.isDigit(contraseña.charAt(i)))//verdadero o falso
						{
							contNumeros++;
						}
						
					}//fin for
					
					if(contadorM<2)//evaluar que la contraseña posea mas de 2 caracteres en mayusculas
					{
						System.out.println("la contraseña debe contener al menos 2 mayusculas");
					}
					if(contNumeros<3)//evaluar que la contraseña posea mas de 3 numeros
					{
						System.out.println("la contraseña debe contener mas de 3 numeros");
					}
					
					//clase matcher para veririficar si la contraseña contiene caracteres especiales
					//Matcher hasSpecial = especial.matcher(contraseña);
					//if(hasSpecial.find())//si encuentra un caracter especial, find() devuelve true
					//{
						//caractEspecial = true;
					//}
				
				}
				
				
				
				
				
				
				
			}while(contraseña.length() <10 || contadorM<2  || contNumeros<3 );
			//caractEspecial!=true
			
			
			System.out.print("Ingrese su nombreCompleto: ");
			nombreCompleto=sc.nextLine();
														//0 - 1-  2
			System.out.print("Ingrese su fechaNacimiento DD-MM-AAAA: ");
			fechaNacimiento=sc.nextLine();
			misFechas = fechaNacimiento.split("-");
			//busca un caracter guion, si lo encuentra en la cadena, cortara en trozos la cadena para 
			//insertar en un vector llamado misFechas
			
															//indice 2
			fechaEntera = Integer.parseInt(misFechas[2]);//convierto a entero el año
			
			edad=anioActual-fechaEntera;
			
			
			if(edad >= 18)
			{
				mensaje = "Puede pasar a la zona  para mayores de 18 años";
			}
			else
			{
				mensaje = "No puede ingresar a la zona para mayores de 18 años";
			}
			//Recien creamos el usuario una vez validado todo
			Persona usuario = new Persona(nombre, contraseña, nombreCompleto, fechaNacimiento);
			
			System.out.println("Bienvenido "+usuario.nombre);
			
			System.out.println(mensaje);
			
			System.out.println(cantUsuarios+"-"+usuario.nombre);
			
			System.out.println("-----------------------------------------------------");
			
			
			cantUsuarios++;//contamos los usuarios ya validados
		}while(cantUsuarios<=10);//mientras la cantiendad sea menor a 10, iteramos
	
		
		
		
		
 		
		
	}

}
