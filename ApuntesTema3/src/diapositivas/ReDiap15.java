package diapositivas;

import java.util.Scanner;

public class ReDiap15 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		String caracter="";
		
		do {
			System.out.println("Dime una letra");
			caracter = sca.next();
		}
		while(!(caracter.equalsIgnoreCase("A")||
			  caracter.equalsIgnoreCase("E")||
			  caracter.equalsIgnoreCase("I")||
			  caracter.equalsIgnoreCase("O")||
			  caracter.equalsIgnoreCase("U")));
		System.out.printf("La letra %s es vocal",caracter);
	}

}
