package diapositivas;

import java.util.Scanner;

public class ReReReDiap22 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		System.out.println("Dime un numero entero");
		int numero = sca.nextInt();
		int contador=0;
		
		do {
			System.out.println("Vmos a ver una peli");
			contador++;
			
		}
		while(contador<numero);
		
	}

}
