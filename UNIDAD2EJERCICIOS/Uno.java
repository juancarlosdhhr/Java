
/* P1. Crea un programa que pida al usuario un número entero y diga si es par (pista: habrá que
comprobar si el resto que se obtiene al dividir entre dos es cero: if (x % 2 == 0) …). */


package UNIDAD2EJERCICIOS;

import java.util.Scanner;

public class Uno {
   public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario un número
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        // Comprobar si es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}


