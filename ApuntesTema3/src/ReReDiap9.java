
import java.util.Scanner;

public class ReReDiap9 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		int suma = 0;
		int contador = 0;
		int numero;
		
		do {
			System.out.println("Introduce un número entero");
			numero = sca.nextInt();
			 suma += numero;
			contador++;
		}
		while(contador < 10);
	   
		System.out.printf("La suma es %d y la media es: %02f",suma, ((suma*1.0)/contador));
		
			
		
	}

}
