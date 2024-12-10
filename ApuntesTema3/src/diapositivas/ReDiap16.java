package diapositivas;

import java.util.Scanner;

public class ReDiap16 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner (System.in);
		
		int numero1=1;
		int numero2=1;
		
		do {
			System.out.println("Dime un el primer número entero a compaarar");
			numero1 = sca.nextInt();
			System.out.println("Dime el segundo número entero");
			numero2 = sca.nextInt();
			
		}
		while(numero1 != numero2);
		
		System.out.printf("El numero %d y el %d son iguales",numero1, numero2);

	}

}
