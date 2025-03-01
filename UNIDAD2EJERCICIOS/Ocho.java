
/* P8. Crea un programa que pida al usuario un número entero y responda si es múltiplo de 2 y de
3 simultáneamente. */


package UNIDAD2EJERCICIOS;

import java.util.Scanner; 


public class Ocho { // Falta definir la clase
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario un número entero
        System.out.print("Introduce un número entero: ");
        int num = scanner.nextInt();

        // Comprobar si es múltiplo de 2 y de 3 simultáneamente
        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("El número " + num + " es múltiplo de 2 y de 3 simultáneamente.");
        } else {
            System.out.println("El número " + num + " no es múltiplo de 2 y de 3 simultáneamente.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
