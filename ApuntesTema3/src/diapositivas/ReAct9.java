package diapositivas;

import java.util.Scanner;

public class ReAct9 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		int inferior;
		int superior;
		int suma=0;
		int contadorFuera=0;
		int contadorLimites=0;
		int numero;
		do {
		System.out.println("Dime el limite inferior");
		inferior= sca.nextInt();
		System.out.println("Dime el limite superior");
		superior = sca.nextInt();
		
		}while(superior<inferior);
		
		do {
			
		System.out.println("dime un numero");
		 	numero=sca.nextInt();
			if(numero>inferior && numero<superior) {
				suma = suma+numero;
			}else if(numero<inferior || numero>superior) {
				contadorFuera++;
			}else if(numero==superior || numero==inferior) {
				  contadorLimites++;
			}
		}while(numero==0);
		System.out.printf("La suma de los numero del intervalo es %d \n",suma);
		System.out.printf("Hay %d numeros fuera del intervalo\n",contadorFuera);
		System.out.printf("Se han introducido %d numeros en el limite\n",contadorLimites);
		
		
		
			
	}

}
