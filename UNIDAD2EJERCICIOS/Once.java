
/* P11. Crea un programa que pida al usuario dos números enteros y diga si ambos son pares. */


package UNIDAD2EJERCICIOS;
import java.util.Scanner;
public class Once {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario dos números enteros
        System.out.print("Introduce el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número entero: ");
        int num2 = scanner.nextInt();

        // Comprobar si ambos números son pares
        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("Ambos números son pares.");
        } else {
            System.out.println("Uno o ambos números no son pares.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
