package diapositivas;

import java.util.Scanner;

public class ReDiap25 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		int numero=0;
		int suma=0;
		for(int i =0;i<10;i++) {
			System.out.println("Dime un número entero");
			numero = sca.nextInt();
			suma = suma +numero;
		}
		System.out.printf("El total es %d y la media es: %02f",suma, suma*1.0/10);
	}

}
