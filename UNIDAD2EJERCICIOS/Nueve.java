
/* P9. Crea un programa que pida al usuario un número entero y responda si es múltiplo de 2 pero
no de 3. */


package UNIDAD2EJERCICIOS;
import java.util.Scanner;
public class Nueve {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario un número entero
        System.out.print("Introduce un número entero: ");
        int num = scanner.nextInt();

        // Comprobar si es múltiplo de 2 pero no de 3
        if (num % 2 == 0 && num % 3 != 0) {
            System.out.println("El número " + num + " es múltiplo de 2 pero no de 3.");
        } else {
            System.out.println("El número " + num + " no cumple la condición.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
