package diapositivas;

import java.util.Scanner;

public class ReDiap26 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		System.out.println("Dime un número entero del 1 al 10");
		int numero = sca.nextInt();
		System.out.printf("La tabla del %d \n",numero);
		for(int i =1;i<=10;i++) {
			int resultado= numero*i;
			System.out.printf("%d x %d = %d \n",numero, i, resultado);
			
		}

	}

}
