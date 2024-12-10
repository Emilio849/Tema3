package diapositivas;

import java.util.Scanner;

public class RrrrrrrrrDiap10 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		int numero=1;
		
		while(numero !=0) {
			System.out.println("Dime un número entero");
			numero = sca.nextInt();
			if(numero %2 ==0) {
				System.out.printf("El numero %d es par \n",numero);
			}
			else {
				System.out.println("Es impar");
			}
		}

	}

}
