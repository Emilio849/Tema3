import java.util.Scanner;

public class ReDiap9 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		int suma = 0;
		int contador = 0;
		
		while(contador < 10) {
			System.out.println("Introduce un número entero");
			int numero = sca.nextInt();
			suma = suma + numero;
			contador++;
			
		}
		 System.out.printf("La suma es: %d y la media es: %f02",suma, (suma*1.0 / contador));
		
		}

}
