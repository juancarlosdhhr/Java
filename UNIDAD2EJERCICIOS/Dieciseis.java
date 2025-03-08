
/* P16. Crea un programa que pida al usuario dos números enteros y diga si son iguales o, en caso
contrario, cuál es el mayor de ellos. */


package UNIDAD2EJERCICIOS;

import java.util.Scanner; // Importamos Scanner para leer datos del usuario

public class Dieciseis { // Nombre de la clase
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario dos números enteros
        System.out.print("Introduce el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número entero: ");
        int num2 = scanner.nextInt();

        // Comparar los números
        if (num1 == num2) {
            System.out.println("Los números son iguales.");
        } else if (num1 > num2) {
            System.out.println("El número mayor es: " + num1);
        } else {
            System.out.println("El número mayor es: " + num2);
        }

        // Cerrar el scanner
        scanner.close();
    }
}