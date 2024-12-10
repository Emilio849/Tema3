package diapositivas;

import java.util.Scanner;

public class ReReSiap22 {

	public static void main(String[] args) {
	
		Scanner sca = new Scanner(System.in);
		System.out.println("Dime un número");
		int veces = sca.nextInt();
		int contador=1;
		
		while(contador<= veces) {
			System.out.println("Hoy vamos a ver una peli");
			contador++;
		}
	}

}
