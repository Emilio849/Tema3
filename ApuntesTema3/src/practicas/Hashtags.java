package practicas;

import java.util.Scanner;

public class Hashtags {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		String cadena = "";
		
		do {
			System.out.println("Introduce el hashtags");
			cadena = sca.next();
		}
		while(!cadena.matches(".*[_].*") || !cadena.matches("[#].*"));
		System.out.println("Hashtag correcto");
	}

}
