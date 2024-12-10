package diapositivas;

import java.util.Scanner;

public class ReDiap17 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		int numero=1;
		int suma=0;
		int contador=0;
		
		do {
			System.out.println("Dime un numero entero");
			numero = sca.nextInt();
			suma = suma +numero;
			contador++;
		}
		while(contador <=10);
		 System.out.printf("La suma es %d y la media %02f",suma, suma*1.0/10);
	}

}
