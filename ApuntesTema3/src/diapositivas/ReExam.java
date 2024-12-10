package diapositivas;

import java.util.Scanner;

public class ReExam {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		int combinacion=333;
		int numero;
		int contador=0;
		for(int i = 0;i<4;i++) {
			
			contador++;
		do {
			System.out.println("Introduce la combinacion");
			numero = sca.nextInt();
			
			
		}while(combinacion!=numero);
		System.out.println("Felicidades");
	}
	}

}
