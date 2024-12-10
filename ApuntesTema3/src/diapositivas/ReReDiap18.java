package diapositivas;

import java.util.Random;
import java.util.Scanner;

public class ReReDiap18 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		Random random = new Random();
		
		int solucion = 0;
		int suma=0;
		int contador=0;
		
		do {
			int random1 = random.nextInt(1, 101);
			int random2 = random.nextInt(1, 101);
			suma = random1 + random2;
			System.out.printf("Resuelve : %d + % d = ",random1, random2);
			solucion = sca.nextInt();
			contador++;
		}
		while(solucion == suma);
			System.out.printf("Has tenido %d aciertos",contador);
		

	}

}
