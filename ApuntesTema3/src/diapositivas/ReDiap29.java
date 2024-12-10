package diapositivas;

import java.util.Scanner;

public class ReDiap29 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		System.out.println("Dime un número entero");
		int numero = sca.nextInt();
		
		long factorial = numero;
		
		for(int i = numero-1;i>=2;i--) {
			factorial = factorial*i;
			
		}
			System.out.println(factorial);
	}

}
