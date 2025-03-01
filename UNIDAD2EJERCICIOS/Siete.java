/* P7. Crea un programa en java que pida al usuario un número entero y responda si es múltiplo
de 2 o de 3. */



package UNIDAD2EJERCICIOS;

import java.util.Scanner;

public class Siete {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario un número entero
        System.out.print("Introduce un número entero: ");
        int num = scanner.nextInt();

        // Comprobar si es múltiplo de 2 o de 3
        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("El número " + num + " es múltiplo de 2 y de 3.");
        } else if (num % 2 == 0) {
            System.out.println("El número " + num + " es múltiplo de 2.");
        } else if (num % 3 == 0) {
            System.out.println("El número " + num + " es múltiplo de 3.");
        } else {
            System.out.println("El número " + num + " no es múltiplo de 2 ni de 3.");
        }

        // Cerrar el scanner
        scanner.close();
    }  
}
