
/* P6. Crea un programa que pida al usuario dos números enteros. Si el segundo no es cero,
mostrará el resultado de dividir el primero entre el segundo. Por el contrario, si el segundo
número es cero, escribirá "Error: No se puede dividir entre cero".
 */


package UNIDAD2EJERCICIOS;
import java.util.Scanner;
public class Seis {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario los dos números
        System.out.print("Introduce el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número entero: ");
        int num2 = scanner.nextInt();

        // Verificar si el segundo número es 0
        if (num2 == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
        } else {
            // Calcular la división
            double resultado = (double) num1 / num2; // Convertimos a double para obtener decimales si es necesario
            System.out.println("El resultado de la división es: " + resultado);
        }

        // Cerrar el scanner
        scanner.close();
    } 
}
