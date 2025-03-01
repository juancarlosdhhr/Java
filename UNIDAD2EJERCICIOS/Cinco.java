

/* P5. Crea un programa que multiplique dos números enteros de la siguiente forma: pedirá al
usuario un primer número entero. Si el número que se que teclee es 0, escribirá en pantalla "El
producto de 0 por cualquier número es 0". Si se ha tecleado un número distinto de cero, se
pedirá al usuario un segundo número y se mostrará el producto de ambos. */


package UNIDAD2EJERCICIOS;

import java.util.Scanner;

public class Cinco {
    public static void main(String[] args) {  // ← El código debe ir dentro de `main`
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el primer número
        System.out.print("Introduce el primer número entero: ");
        int num1 = scanner.nextInt();

        // Comprobar si el primer número es 0
        if (num1 == 0) {
            System.out.println("El producto de 0 por cualquier número es 0.");
        } else {
            // Si no es 0, pedir el segundo número
            System.out.print("Introduce el segundo número entero: ");
            int num2 = scanner.nextInt();

            // Calcular el producto
            int producto = num1 * num2;

            // Mostrar el resultado
            System.out.println("El producto de " + num1 + " y " + num2 + " es: " + producto);
        }

        // Cerrar el scanner
        scanner.close();
    }
}
