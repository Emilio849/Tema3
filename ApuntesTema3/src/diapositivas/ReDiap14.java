package diapositivas;

import java.util.Scanner;

public class ReDiap14 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		int numero=1;
		int contador=0;
		
		do {
			System.out.println("Dime un número entre 1 y 10");
			numero= sca.nextInt();
				contador++;

		}while(numero >=1 && numero <=10);
		System.out.println("Número fuera de rango");
		
	}

}
