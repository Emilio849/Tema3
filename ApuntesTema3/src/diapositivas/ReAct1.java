package diapositivas;

import java.util.Scanner;

public class ReAct1 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		String letra= "";
		do {
			System.out.println("Dime una letra");
			letra = sca.next();
			if(letra.equalsIgnoreCase("A") ||
			  letra.equalsIgnoreCase("E") ||
			  letra.equalsIgnoreCase("I") ||
			  letra.equalsIgnoreCase("O") ||
			  letra.equalsIgnoreCase("U")) { 
			
			System.out.printf("%s es vocal \n",letra);
				
		
			}	
	
			else {
			System.out.println("Es consonante");
			}
			}
		while(!letra.equals(".")); 
		System.out.println("EXIT");
			
		
	}
}

