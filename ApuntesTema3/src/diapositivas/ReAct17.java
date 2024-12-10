package diapositivas;

import java.util.Scanner;

public class ReAct17 {

	public static void main(String[] args) {	

	Scanner sca = new Scanner(System.in);
	
		System.out.println("Dime un número entero");
		long numero = sca.nextLong();
	
		int pares=0;
		int sumaPares=0;
	
		for(long i= numero;i>0;i/=10) {
			long digito=i%10;
			if(digito%2==0) {
				sumaPares+=digito;
				pares++;
				
			}
			
		}
	
		System.out.printf("El numero %d tiene %d pares y suman %d \n",numero, pares, sumaPares);
	}
}