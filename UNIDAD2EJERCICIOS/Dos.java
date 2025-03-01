
/* P2. Crea un programa que pida al usuario dos números enteros y diga cuál es el mayor de ellos. */


package UNIDAD2EJERCICIOS;

import java.util.Scanner;

public class Dos {
    public static void main(String[] args) { // Faltaba el método main
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario dos números
        System.out.print("Introduce el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número entero: ");
        int num2 = scanner.nextInt();

        // Comparar los números e imprimir el resultado
        if (num1 > num2) {
            System.out.println("El número mayor es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El número mayor es: " + num2);
        } else {
            System.out.println("Los números son iguales.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
