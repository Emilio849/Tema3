package diapositivas;

import java.util.Scanner;

public class ReReDiap26 {

	public static void main(String[] args) {
		
		Scanner sca =new Scanner(System.in);
		
		int numero=0;
		
		do {
			System.out.println("Dime un número entre 1 y 10");
			numero = sca.nextInt();
			if(numero <0 && numero>10) {
				System.out.println("Fuera de reango.Introduce un número del 1 al 10");
			}
		}
		while(!(numero>0 &&numero <=10));
		System.out.printf("La tabla del %d \n",numero);
		 for(int i=1;i<=10;i++) {
			 
		 System.out.printf("%d x %d = %d \n",numero, i ,numero*i );
		 }
	}

}
