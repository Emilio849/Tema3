package diapositivas;

import java.util.Scanner;

public class ExamEjer2 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		int clave = 333;
		int numero;
		int contador=1;
		
		do {
			System.out.println("Introduce la Conbinacion");
			numero = sca.nextInt();
			contador++;
			
			if(numero == clave) {
				System.out.println("felicidades");
			}
			
		}
		while(contador<=4);
		System.out.println("Combinación erronea");

	}

}
