/* P10. Crea un programa que pida al usuario un número entero y responda si no es múltiplo de 2
ni de 3. */



package UNIDAD2EJERCICIOS;
import java.util.Scanner;
public class Diez {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario un número entero
        System.out.print("Introduce un número entero: ");
        int num = scanner.nextInt();

        // Comprobar si no es múltiplo de 2 ni de 3
        if (num % 2 != 0 && num % 3 != 0) {
            System.out.println("El número " + num + " NO es múltiplo de 2 ni de 3.");
        } else {
            System.out.println("El número " + num + " es múltiplo de 2, de 3 o de ambos.");
        }

        // Cerrar el scanner
        scanner.close();
    }  
}
