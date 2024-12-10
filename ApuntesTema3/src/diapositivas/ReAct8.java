package diapositivas;

import java.util.Scanner;

public class ReAct8 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		int numero;
		int contador=0;
		int contadorImpar=0;
		int sumaImpar=0;
		int mayor=0;
		do {
			System.out.println("Dime un entero positivo");
			numero = sca.nextInt();
			contador++;
			if(numero%2 ==1) {
				sumaImpar= sumaImpar + numero;
				contadorImpar++;
			}
			if(numero%2==0) {
				
				if(numero>mayor) {
					mayor= numero;
				}
			}
		}
		while(numero!=0);
		 System.out.printf("Has introducido %d numeros\n",contador);
		 System.out.printf("La media de los impares es %d\n",sumaImpar/contadorImpar);
		 System.out.printf("El mayor par es %d",mayor);
		}
		
		
		
	}


