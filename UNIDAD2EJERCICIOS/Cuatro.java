
/* P4. Crea un programa que pida al usuario un número entero. Si es múltiplode 10, informará al
usuario y pedirá un segundo número, para decir a continuación si este segundo número también
es múltiplo de 10. */



package UNIDAD2EJERCICIOS;
import java.util.Scanner;
public class Cuatro {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario un número entero
        System.out.print("Introduce un número entero: ");
        int num1 = scanner.nextInt();

        // Comprobar si el primer número es múltiplo de 10
        if (num1 % 10 == 0) {
            System.out.println(num1 + " es múltiplo de 10.");

            // Pedir un segundo número
            System.out.print("Introduce otro número entero: ");
            int num2 = scanner.nextInt();

            // Comprobar si el segundo número también es múltiplo de 10
            if (num2 % 10 == 0) {
                System.out.println(num2 + " también es múltiplo de 10.");
            } else {
                System.out.println(num2 + " no es múltiplo de 10.");
            }
        } else {
            System.out.println(num1 + " no es múltiplo de 10.");
        }

        // Cerrar el scanner
        scanner.close();
    } 
}
