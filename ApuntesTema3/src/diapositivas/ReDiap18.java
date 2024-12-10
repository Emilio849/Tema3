package diapositivas;

import java.util.Random;
import java.util.Scanner;

public class ReDiap18 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		Random random = new Random();
		
		int sumaRandom= 0;
		int contador=0;
		int suma=0;
		
		do {
			int random1 = random.nextInt(1,101);
			int random2 = random.nextInt(1,101);
			
			System.out.printf("Resuelve: %d + %d = ",random1, random2);
			suma = sca.nextInt();
			sumaRandom = random1 + random2;
			contador++;
		}
		while(suma == sumaRandom);
		System.out.printf("Felicidaes has acertado %d veces",contador);
		
	}

}
