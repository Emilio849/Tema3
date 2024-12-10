package diapositivas;

import java.util.Scanner;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class ReAct13 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		String password;
		int mayusculas;
		int minusculas;
		int numero;
		int especial;
		do {
			System.out.println("Introduce el password");
			password = sca.next();
			mayusculas=0;
			minusculas=0;
			numero=0;
			especial=0;
			
				for(int i =0;i<password.length();i++) {
					String caracter= password.substring(i,i+1);
					if(caracter.matches("[A-Z]")) {
						mayusculas++;
					}else if(caracter.matches("[a-z]")) {
							minusculas++;
						}
					else if(caracter.matches("[0-9]")) {
						numero++;
					}else if(caracter.matches("[@#*%&/]")) {
						especial++;
					}
					}
				if(mayusculas>=2 && minusculas>=2 && numero>=2 && especial>=2 && password.length()>=10) {
					System.out.println("Contraseña correcte");
				}
				else {
					System.out.println("Contraseña no valida");
				}
		}
		while(!(mayusculas>=2 || minusculas>=2 || numero>=2 || especial>=2 || password.length()>=10));
		

	}

}

