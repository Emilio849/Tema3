package diapositivas;

import java.util.Scanner;

public class ReReReDiap23 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		System.out.println("Dime un número entero");
		int numero = sca.nextInt();
		int contador=1;
		do {
			System.out.println(contador);
			contador++;
		}
		while(contador <=numero);
	}
	
		
	

}
