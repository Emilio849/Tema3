package diapositivas;

import java.util.Random;
import java.util.Scanner;

public class ReAct18 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		Random random = new Random();
		
		int aleatorio = random.nextInt(100000000,1000000000);
		int contIng=0;
		int contFra=0;
		int contMba=0;
		System.out.println("numero generado: "+aleatorio);
		for(int i =aleatorio;i>0;i/=10) {
			int digito = i%10;
			if(digito%2==0) {
				contFra++;
			}else if(digito%4 ==0){
				contMba++;
			}else {
				contIng++;
			}
		}
		
		System.out.printf("FRANCIA %d - %d INGLATERRA \n",contFra, contIng);
		System.out.printf("Goles de Mbappé: %d",contMba);
	}

}
