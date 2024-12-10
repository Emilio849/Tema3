package diapositivas;

import java.util.Scanner;

public class Suerte {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("Dime un numero entero");
		int numero = sca.nextInt();
		int buena=0;
		int mala = 0;
		for(int i =numero;i>0;i/=10) {
			int digito = i%10;
			if(digito ==3 || digito==7 || digito==8 || digito==9) {
				buena++;
			}
			else if(digito==0 || digito==1 || digito==2 ||digito==4 ||digito==5 ||digito==6) {
				mala++;
				
			}
		}
		if(buena>mala) {
			System.out.println("Felicidades");
		}
		else {
			System.out.println("Lo siento");
		}
		

	}

}
