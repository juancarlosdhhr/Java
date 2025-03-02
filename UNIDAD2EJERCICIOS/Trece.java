

/* P13. Crea un programa que pida al usuario dos números enteros y diga si uno y sólo uno es par. */


package UNIDAD2EJERCICIOS;
import java.util.Scanner;
public class Trece {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario dos números enteros
        System.out.print("Introduce el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número entero: ");
        int num2 = scanner.nextInt();

        // Comprobar si uno y solo uno es par
        if ((num1 % 2 == 0 && num2 % 2 != 0) || (num1 % 2 != 0 && num2 % 2 == 0)) {
            System.out.println("Uno y solo uno de los números es par.");
        } else {
            System.out.println("No se cumple la condición. Ambos son pares o ambos son impares.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
