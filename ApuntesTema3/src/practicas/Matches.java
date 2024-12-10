package practicas;

import java.util.Scanner;

public class Matches {

	public static void main(String[] args) {
		/*Nos han encargado realizar el validador de contraseña 
		 * de una determinada web. El usuario debe introducir una 
		 * contraseña y el sistema la debe validar. La contraseña 
		 * debe tener un mínimo de 10 caracteres. Cómo mínimo debe 
		 * contener: dos letras mayúsculas, dos letras minúsculas, 
		 * dos números y dos caracteres especiales (@, #, *, %, &, /).
		 */
		Scanner sca = new Scanner(System.in);
		
		String password;
		int mayuscula;
		int minuscula;
		int numero;
		int especial;
		
		do {
			System.out.println("Introduce la contraseña");
			password = sca.next();
			
			mayuscula = 0;
			minuscula = 0;
			numero = 0;
			especial = 0;
		for(int i = 0; i<password.length();i++) {
				String caracter = password.substring(i, i+1);
	
			if(caracter.matches("[A-z]")) {
				mayuscula++;
			}
			else if(caracter.matches("[a-z]")) {
				minuscula++;
			}
			else if(caracter.matches("[0-9]")) {
				numero++;
			}
			else if(caracter.matches("[@#*%&/]")) {
				especial++;
			}
		}
			if(mayuscula>= 2 && minuscula >= 2 && numero >=2 && especial>=2 && password.length() >=10) {
				System.out.println("Contraseña correcta");
				
			}else {
				System.out.println("Contraseña no valida");
			}
		}
			
			while(mayuscula>= 2 && minuscula >= 2 && numero >=2 && especial>=2 && password.length() >=10);
			
			 System.out.println("Contraseña no valida");
				
			
		}
		

	}


