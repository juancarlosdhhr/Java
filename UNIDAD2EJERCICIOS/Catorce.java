
/* P14. Crea un programa que pida al usuario dos números enteros y diga "Uno de los números es
positivo", "Los dos números son positivos" o bien "Ninguno de los números es positivo", según
corresponda. */


package UNIDAD2EJERCICIOS;
import java.util.Scanner;
public class Catorce {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario dos números enteros
        System.out.print("Introduce el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número entero: ");
        int num2 = scanner.nextInt();

        // Evaluamos las condiciones
        if (num1 > 0 && num2 > 0) {
            System.out.println("Los dos números son positivos.");
        } else if (num1 > 0 || num2 > 0) {
            System.out.println("Uno de los números es positivo.");
        } else {
            System.out.println("Ninguno de los números es positivo.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
