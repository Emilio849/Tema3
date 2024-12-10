package diapositivas;

import java.util.Scanner;

public class ReReDiap23 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		System.out.println("dime un número entero");
		int numero = sca.nextInt();
		
		int contador=1;
		while(contador<=numero) {
			
			System.out.println(contador);
			contador++;
	
		}

	}

}
