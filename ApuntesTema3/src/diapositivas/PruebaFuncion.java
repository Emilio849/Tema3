// Definimos el paquete donde se encuentra nuestra clase
package diapositivas;

// Importamos la clase Scanner del paquete java.util para leer entrada del usuario
import java.util.Scanner;

public class PruebaFuncion {
    // Método estático que valida la longitud de un String
    // Parámetros: mensaje a mostrar y longitud requerida
    // Retorna: String validado
    public static String validarDeLongitudString(String mensaje, int longitudRequerida) {
        // System.in representa la entrada estándar (teclado)
        Scanner scanner = new Scanner(System.in);
        String entrada;

        // Bucle do-while: ejecuta al menos una vez y repite mientras la condición sea true
        do {
            // System.out representa la salida estándar (pantalla)
            // print() muestra texto sin salto de línea
            System.out.print(mensaje);
            
            // nextLine() lee una línea completa hasta que se presiona Enter
            entrada = scanner.nextLine();

            // Verifica si la longitud no es la requerida
            if (entrada.length() != longitudRequerida) {
                // printf permite formatear texto con placeholders:
                // %d: número entero
                // %n: salto de línea específico del sistema
                System.out.printf("Error: El texto debe tener exactamente %d caracteres%n",
                        longitudRequerida);
            }
        } while (entrada.length() != longitudRequerida); // Repite si la longitud no es correcta

        return entrada;
    }

    // Método principal que ejecuta el programa
    public static void main(String[] args) {
        // Llama al método de validación con mensaje y longitud específica
        String codigo = validarDeLongitudString("Ingrese el código (5 caracteres): ", 5);
        // println() muestra texto con salto de línea al final
        System.out.println("Código válido: " + codigo);
    }
}
