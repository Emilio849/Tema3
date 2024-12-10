package diapositivas;

import java.util.Scanner;

public class ReReReDiap9 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		int numero;
		int contador = 0;
		int suma = 0;
		while(contador<10) {
			System.out.println("Dime un número entero");
			numero = sca.nextInt();
			suma = suma + numero;
			contador++;
		}
		System.out.printf("La suma es %d y la media es %02f",suma ,suma+1.0/contador );

	}

}
