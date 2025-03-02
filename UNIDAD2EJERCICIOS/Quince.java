

/* P15. Crea un programa que pida al usuario tres números y muestre cuál es el mayor de los tres. */


package UNIDAD2EJERCICIOS;
import java.util.Scanner;
public class Quince { // Nombre de la clase
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario tres números enteros
        System.out.print("Introduce el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número entero: ");
        int num2 = scanner.nextInt();

        System.out.print("Introduce el tercer número entero: ");
        int num3 = scanner.nextInt();

        // Determinar el mayor de los tres números
        int mayor = num1; // Suponemos que el primero es el mayor

        if (num2 > mayor) {
            mayor = num2; // Si num2 es mayor, actualizamos la variable
        }

        if (num3 > mayor) {
            mayor = num3; // Si num3 es mayor, actualizamos la variable
        }

        // Mostrar el resultado
        System.out.println("El número mayor es: " + mayor);

        // Cerrar el scanner
        scanner.close();
    }
}
