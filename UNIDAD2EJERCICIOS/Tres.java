
/* P3. Crea un programa que pida al usuario dos números enteros y diga si el primero es múltiplo
del segundo (pista: igual que en el ejercicio P1, habrá que ver si el resto de la división es cero: a
% b == 0). */



package UNIDAD2EJERCICIOS;
import java.util.Scanner;

public class Tres {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario dos números
        System.out.print("Introduce el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número entero: ");
        int num2 = scanner.nextInt();

        // Verificar si el primer número es múltiplo del segundo
        if (num2 != 0) { // Evitamos división por cero
            if (num1 % num2 == 0) {
                System.out.println(num1 + " es múltiplo de " + num2);
            } else {
                System.out.println(num1 + " no es múltiplo de " + num2);
            }
        } else {
            System.out.println("Error: No se puede dividir entre 0.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}



