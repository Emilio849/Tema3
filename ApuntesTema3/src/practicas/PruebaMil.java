package practicas;

import java.util.Scanner;

public class PruebaMil {

	public static void main(String[] args) {
		/*Nos han encargado realizar un validador para los hashtags de la Dreamhack. El hashtag debe tener el formato 
		 * #dreamhack_loquesea, es decir, debe comenzar por el símbolo # y contener una barra baja. Si no hemos introducido 
		 * un hashtag correcto nos debe pedir de nuevo una cadena.
		 *NOTA: Te puedes ayudar de las siguientes funciones del tipo String:
		*caracter.matches("[#]") - Devuelve true si contiene #.
		*caracter.matches("[_]") - Devuelve true si contiene una barra baja.
         */
			
		Scanner sc = new Scanner(System.in);
		String cadena = "";
		do {
		System.out.println("Dime: ");
		cadena = sc.next();
		}while(!cadena.matches(".*[].*") || !cadena.matches("[#].*"));
		System.out.println("Hashtag aceptable");

	}

}
