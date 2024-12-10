package diapositivas;

import java.util.Scanner;

public class ReDiap28 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		System.out.println("Dime un número positivo");
		int numero = sca.nextInt();
		
		if(numero>0) {
		
		for(int i =numero;i>0;i/=10) {
			int digito = i%10;
			System.out.println(digito);
		}
	}
		else {
			System.out.printf("%d no es positivo",numero);
		}
		}

}
