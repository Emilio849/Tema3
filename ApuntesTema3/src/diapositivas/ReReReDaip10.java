package diapositivas;

import java.util.Scanner;

public class ReReReDaip10 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		int numero =1;
		
		while(numero !=0) {
			System.out.println("Dime un número y te dire si es par");
				numero = sca.nextInt();
			if(numero %2 ==0) {
				System.out.printf("El número %d es par \n",numero);
		
		}
		}

	}

}
