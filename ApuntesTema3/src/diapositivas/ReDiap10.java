package diapositivas;

import java.util.Scanner;

public class ReDiap10 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		int numero = 1;
		
		while(numero !=0) {
			System.out.println("Dime un numero entero ");
			numero = sca.nextInt();
			if(numero %2==0) {
				System.out.printf("El número %d es par \n",numero);
			}
			
			
		}

	}

}
